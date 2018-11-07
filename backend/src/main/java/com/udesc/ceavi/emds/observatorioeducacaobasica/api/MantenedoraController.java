package com.udesc.ceavi.emds.observatorioeducacaobasica.api;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.Mantenedora;
import com.udesc.ceavi.emds.observatorioeducacaobasica.responses.Response;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.MantenedoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
//@RequestMapping(path = "/api/mantenedora")
public class MantenedoraController {
    @Autowired
    private MantenedoraService mantenedoraService;

//    @GetMapping
//    public ResponseEntity<Response<List<Mantenedora>>> listarTodos() {
//        return ResponseEntity.ok(new Response<List<Mantenedora>>(this.mantenedoraService.listarTodos()));
//    }

//    @GetMapping(path = "/{id}")
//    public ResponseEntity<Response<Mantenedora>> mantenedoraPorId(@PathVariable(name = "id") String id) {
//        return ResponseEntity.ok(new Response<Mantenedora>(this.mantenedoraService.listarPorId(id)));
//    }
    @RequestMapping(value = "/user/", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Mantenedora>> cadastrar(@Valid @RequestBody Mantenedora mantenedora, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            erros.clear();
            erros.add("Juka bala");
            return ResponseEntity.badRequest().body(new Response<Mantenedora>(erros));
        }
        return ResponseEntity.ok(new Response<Mantenedora>(this.mantenedoraService.cadastrar(mantenedora)));
    }

//    @PutMapping(path = "/{id}")
//    public ResponseEntity<Response<Mantenedora>> atualizar(@PathVariable(name = "id") String id, @RequestBody Mantenedora mantenedora, BindingResult result) {
//        if (result.hasErrors()) {
//            List<String> erros = new ArrayList<String>();
//            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
//            return ResponseEntity.badRequest().body(new Response<Mantenedora>(erros));
//        }
//        mantenedora.setCnpjMantenedora(id);
//        return ResponseEntity.ok(new Response<Mantenedora>(this.mantenedoraService.atualizar(mantenedora)));
//    }

//    @DeleteMapping(path = "/{id}")
//    public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id) {
//        this.mantenedoraService.remover(id);
//        return ResponseEntity.ok(new Response<Integer>(1));
//    }
}
