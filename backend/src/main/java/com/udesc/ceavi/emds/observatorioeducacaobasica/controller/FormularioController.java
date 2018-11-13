package com.udesc.ceavi.emds.observatorioeducacaobasica.controller;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.formulario.Formulario;
import com.udesc.ceavi.emds.observatorioeducacaobasica.responses.Response;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.FormularioService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

//@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(path = "/formulario")
public class FormularioController {

    @Autowired
    private FormularioService formularioService;

    @RequestMapping(value = "/all", method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<List<Formulario>>> listarTodas() {
        return ResponseEntity.ok(new Response<List<Formulario>>(this.formularioService.listarTodos()));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Formulario>> formularioPorId(@PathVariable(name = "id") ObjectId id) {
        return ResponseEntity.ok(new Response<Formulario>(this.formularioService.listarPorId(id)));
    }

    @RequestMapping(value = "/cadastro", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Formulario>> cadastrar(@Valid @RequestBody Formulario formulario, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Formulario>(erros));
        }
        return ResponseEntity.ok(new Response<Formulario>(this.formularioService.cadastrar(formulario)));
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Formulario>> atualizar(@PathVariable(name = "id") ObjectId id, @RequestBody Formulario formulario, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Formulario>(erros));
        }
        formulario.set_id(id);
        return ResponseEntity.ok(new Response<Formulario>(this.formularioService.atualizar(formulario)));
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") ObjectId id) {
        Formulario a = this.formularioService.listarPorId(id);
        System.out.println("Formulario encontrado " + a.toString());
        this.formularioService.remover(a);
        return ResponseEntity.ok(new Response<Integer>(1));
    }
}
