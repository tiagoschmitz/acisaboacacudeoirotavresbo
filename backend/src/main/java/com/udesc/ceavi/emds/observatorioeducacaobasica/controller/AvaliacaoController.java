package com.udesc.ceavi.emds.observatorioeducacaobasica.controller;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.Avaliacao;
import com.udesc.ceavi.emds.observatorioeducacaobasica.responses.Response;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.AvaliacaoService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

//@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(path = "/avaliacao")
public class AvaliacaoController {


    private AvaliacaoService avaliacaoService;

    @Autowired
    public AvaliacaoController(AvaliacaoService avaliacaoService) {
        this.avaliacaoService = avaliacaoService;
    }

    @RequestMapping(value = "admin/all", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<List<Avaliacao>>> listarTodas(@AuthenticationPrincipal UserDetails userDetails) {
        System.out.println("User datails " + userDetails.getPassword());
        return ResponseEntity.ok(new Response<List<Avaliacao>>(this.avaliacaoService.listarTodos()));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Avaliacao>> avaliacaoPorId(@PathVariable(name = "id") ObjectId id) {
        return ResponseEntity.ok(new Response<Avaliacao>(this.avaliacaoService.listarPorId(id)));
    }

    @RequestMapping(value = "/cadastro", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Avaliacao>> cadastrar(@Valid @RequestBody Avaliacao avaliacao, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Avaliacao>(erros));
        }
        return ResponseEntity.ok(new Response<Avaliacao>(this.avaliacaoService.cadastrar(avaliacao)));
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Avaliacao>> atualizar(@PathVariable(name = "id") ObjectId id, @RequestBody Avaliacao avaliacao, BindingResult result) {
        System.out.println("To aqui");
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Avaliacao>(erros));
        }
        avaliacao.set_id(id);
        return ResponseEntity.ok(new Response<Avaliacao>(this.avaliacaoService.atualizar(avaliacao)));
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") ObjectId id) {
        System.out.println("To aqui");
        Avaliacao a = this.avaliacaoService.listarPorId(id);
        System.out.println("Avaliacao encontrada " + a.toString());
        this.avaliacaoService.remover(a);
        return ResponseEntity.ok(new Response<Integer>(1));
    }
}
