package com.udesc.ceavi.emds.observatorioeducacaobasica.controller;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.dimensao.Dimensao;
import com.udesc.ceavi.emds.observatorioeducacaobasica.responses.Response;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.DimensaoService;
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
@RequestMapping(path = "/dimensao")
public class DimensaoController {

    @Autowired
    private DimensaoService dimensaoService;

    @RequestMapping(value = "/all", method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<List<Dimensao>>> listarTodas() {
        return ResponseEntity.ok(new Response<List<Dimensao>>(this.dimensaoService.listarTodos()));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Dimensao>> dimensaoPorId(@PathVariable(name = "id") ObjectId id) {
        return ResponseEntity.ok(new Response<Dimensao>(this.dimensaoService.listarPorId(id)));
    }

    @RequestMapping(value = "/cadastro", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Dimensao>> cadastrar(@Valid @RequestBody Dimensao dimensao, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Dimensao>(erros));
        }
        return ResponseEntity.ok(new Response<Dimensao>(this.dimensaoService.cadastrar(dimensao)));
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Dimensao>> atualizar(@PathVariable(name = "id") ObjectId id, @RequestBody Dimensao dimensao, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Dimensao>(erros));
        }
        dimensao.set_id(id);
        return ResponseEntity.ok(new Response<Dimensao>(this.dimensaoService.atualizar(dimensao)));
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") ObjectId id) {
        Dimensao a = this.dimensaoService.listarPorId(id);
        System.out.println("Dimensao encontrada " + a.toString());
        this.dimensaoService.remover(a);
        return ResponseEntity.ok(new Response<Integer>(1));
    }
}
