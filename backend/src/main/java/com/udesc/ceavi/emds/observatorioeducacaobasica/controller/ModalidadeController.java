package com.udesc.ceavi.emds.observatorioeducacaobasica.controller;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.modalidade.Modalidade;
import com.udesc.ceavi.emds.observatorioeducacaobasica.responses.Response;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.ModalidadeService;
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
@RequestMapping(path = "/modalidade")
public class ModalidadeController {

    @Autowired
    private ModalidadeService modalidadeService;

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<List<Modalidade>>> listarTodas() {
        return ResponseEntity.ok(new Response<List<Modalidade>>(this.modalidadeService.listarTodos()));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Modalidade>> modalidadePorId(@PathVariable(name = "id") ObjectId id) {
        return ResponseEntity.ok(new Response<Modalidade>(this.modalidadeService.listarPorId(id)));
    }

    @RequestMapping(value = "/cadastro", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Modalidade>> cadastrar(@Valid @RequestBody Modalidade modalidade, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Modalidade>(erros));
        }
        return ResponseEntity.ok(new Response<Modalidade>(this.modalidadeService.cadastrar(modalidade)));
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Modalidade>> atualizar(@PathVariable(name = "id") ObjectId id, @RequestBody Modalidade modalidade, BindingResult result) {
        System.out.println("To aqui");
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Modalidade>(erros));
        }
        modalidade.set_id(id);
        return ResponseEntity.ok(new Response<Modalidade>(this.modalidadeService.atualizar(modalidade)));
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") ObjectId id) {
        System.out.println("To aqui");
        Modalidade a = this.modalidadeService.listarPorId(id);
        System.out.println("Login encontrado " + a.toString());
        this.modalidadeService.remover(a);
        return ResponseEntity.ok(new Response<Integer>(1));
    }
}
