package com.udesc.ceavi.emds.observatorioeducacaobasica.controller;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.login.Login;
import com.udesc.ceavi.emds.observatorioeducacaobasica.responses.Response;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.LoginService;
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
@RequestMapping(path = "/logins")
public class ControllerLogin {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<List<Login>>> listarTodas() {
        return ResponseEntity.ok(new Response<List<Login>>(this.loginService.getAllUsers()));
    }

    @RequestMapping(value = "/cadastro", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Response<Login>> cadastrar(@Valid @RequestBody Login login, BindingResult result) {
        System.out.println("Chegou objeto "+login.getCnpj());
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Login>(erros));
        }
        return ResponseEntity.ok(new Response<Login>(this.loginService.cadastrar(login)));
    }

    @RequestMapping(path = "/", method = RequestMethod.DELETE)
    public ResponseEntity<Response<Integer>> remover(Login login) {
//        Login a = this.loginService.listarPorId(id);
//        System.out.println("Formulario encontrado " + a.toString());
        this.loginService.remover(login);
        return ResponseEntity.ok(new Response<Integer>(1));
    }
}
