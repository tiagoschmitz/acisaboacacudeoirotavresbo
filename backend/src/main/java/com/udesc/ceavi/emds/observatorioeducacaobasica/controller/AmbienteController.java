package com.udesc.ceavi.emds.observatorioeducacaobasica.controller;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.ambiente.Ambiente;
import com.udesc.ceavi.emds.observatorioeducacaobasica.responses.Response;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.AmbienteService;
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
@RequestMapping(path = "/ambiente")
public class AmbienteController {

    @Autowired
    private AmbienteService ambienteService;

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<List<Ambiente>>> listarTodas() {
        return ResponseEntity.ok(new Response<List<Ambiente>>(this.ambienteService.listarTodos()));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Ambiente>> ambientePorId(@PathVariable(name = "id") ObjectId id) {
        return ResponseEntity.ok(new Response<Ambiente>(this.ambienteService.listarPorId(id)));
    }

    @RequestMapping(value = "/cadastro", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Ambiente>> cadastrar(@Valid @RequestBody Ambiente ambiente, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Ambiente>(erros));
        }
        return ResponseEntity.ok(new Response<Ambiente>(this.ambienteService.cadastrar(ambiente)));
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Ambiente>> atualizar(@PathVariable(name = "id") ObjectId id, @RequestBody Ambiente ambiente, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Ambiente>(erros));
        }
        ambiente.set_id(id);
        return ResponseEntity.ok(new Response<Ambiente>(this.ambienteService.atualizar(ambiente)));
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") ObjectId id) {
        Ambiente a = this.ambienteService.listarPorId(id);
        System.out.println("Ambiente encontrado " + a.toString());
        this.ambienteService.remover(a);
        return ResponseEntity.ok(new Response<Integer>(1));
    }
}
