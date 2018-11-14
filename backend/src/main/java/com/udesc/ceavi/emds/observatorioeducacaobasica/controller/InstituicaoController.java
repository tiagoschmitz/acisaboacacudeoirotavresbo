package com.udesc.ceavi.emds.observatorioeducacaobasica.controller;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.instituicao.Instituicao;
import com.udesc.ceavi.emds.observatorioeducacaobasica.responses.Response;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.InstituicaoService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/instituicao")
public class InstituicaoController {

    @Autowired
    private InstituicaoService instituicaoService;

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<List<Instituicao>>> listarTodas() {
        return ResponseEntity.ok(new Response<List<Instituicao>>(this.instituicaoService.listarTodos()));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Instituicao>> instituicaoPorId(@PathVariable(name = "id") ObjectId id) {
        return ResponseEntity.ok(new Response<Instituicao>(this.instituicaoService.listarPorId(id)));
    }

    @RequestMapping(value = "/cadastro", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Instituicao>> cadastrar(@Valid @RequestBody Instituicao instituicao, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Instituicao>(erros));
        }
        return ResponseEntity.ok(new Response<Instituicao>(this.instituicaoService.cadastrar(instituicao)));
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Instituicao>> atualizar(@PathVariable(name = "id") ObjectId id, @RequestBody Instituicao instituicao, BindingResult result) {
        System.out.println("To aqui");
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Instituicao>(erros));
        }
        instituicao.set_id(id);
        return ResponseEntity.ok(new Response<Instituicao>(this.instituicaoService.atualizar(instituicao)));
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") ObjectId id) {
        System.out.println("To aqui");
        Instituicao a = this.instituicaoService.listarPorId(id);
        System.out.println("Avaliacao encontrada " + a.toString());
        this.instituicaoService.remover(a);
        return ResponseEntity.ok(new Response<Integer>(1));
    }

}
