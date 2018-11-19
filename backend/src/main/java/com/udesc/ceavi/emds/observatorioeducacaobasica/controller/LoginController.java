////package com.udesc.ceavi.emds.observatorioeducacaobasica.controller;
////
////import com.udesc.ceavi.emds.observatorioeducacaobasica.model.login.Login;
////import com.udesc.ceavi.emds.observatorioeducacaobasica.responses.Response;
////import com.udesc.ceavi.emds.observatorioeducacaobasica.services.implementations.LoginService;
////import org.bson.types.ObjectId;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.http.MediaType;
////import org.springframework.http.ResponseEntity;
////import org.springframework.validation.BindingResult;
////import org.springframework.web.bind.annotation.PathVariable;
////import org.springframework.web.bind.annotation.RequestBody;
////import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.bind.annotation.RequestMethod;
////
////import javax.validation.Valid;
////import java.util.ArrayList;
////import java.util.List;
////
////public class LoginController {
////    @Autowired
////    private LoginService loginService;
////
////    @RequestMapping(value = "/all", method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE})
////    public ResponseEntity<Response<List<Login>>> listarTodas() {
////        return ResponseEntity.ok(new Response<List<Login>>(this.loginService.listarTodos()));
////    }
////
////    @RequestMapping(path = "/{id}", method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE})
////    public ResponseEntity<Response<Login>> loginPorId(@PathVariable(name = "id") ObjectId id) {
////        return ResponseEntity.ok(new Response<Login>(this.loginService.listarPorId(id)));
////    }
////
////    @RequestMapping(value = "/cadastro", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
////    public ResponseEntity<Response<Login>> cadastrar(@Valid @RequestBody Login login, BindingResult result) {
////        if (result.hasErrors()) {
////            List<String> erros = new ArrayList<String>();
////            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
////            return ResponseEntity.badRequest().body(new Response<Login>(erros));
////        }
////        return ResponseEntity.ok(new Response<Login>(this.loginService.cadastrar(login)));
////    }
////
////
////    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE})
////    public ResponseEntity<Response<Login>> atualizar(@PathVariable(name = "id") ObjectId id, @RequestBody Login login, BindingResult result) {
////        System.out.println("To aqui");
////        if (result.hasErrors()) {
////            List<String> erros = new ArrayList<String>();
////            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
////            return ResponseEntity.badRequest().body(new Response<Login>(erros));
////        }
////        login.set_id(id);
////        return ResponseEntity.ok(new Response<Login>(this.loginService.atualizar(login)));
////    }
////
////
////    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE, consumes = {MediaType.APPLICATION_JSON_VALUE})
////    public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") ObjectId id) {
////        System.out.println("To aqui");
////        Login a = this.loginService.listarPorId(id);
////        System.out.println("Login encontrado " + a.toString());
////        this.loginService.remover(a);
////        return ResponseEntity.ok(new Response<Integer>(1));
////    }
////}
//
//import com.udesc.ceavi.emds.observatorioeducacaobasica.model.login.Login;
//import com.udesc.ceavi.emds.observatorioeducacaobasica.responses.Response;
//import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.LoginService;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.validation.Valid;
//import java.util.ArrayList;
//import java.util.List;
//
//public class LoginController {
//
//    @Autowired
//    private LoginService loginService;
//
//    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public ResponseEntity<Response<List<Login>>> listarTodas() {
//        return ResponseEntity.ok(new Response<List<Login>>(this.loginService.listarTodos()));
//    }
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public ResponseEntity<Response<Login>> loginPorId(@PathVariable(name = "id") ObjectId id) {
//        return ResponseEntity.ok(new Response<Login>(this.loginService.listarPorId(id)));
//    }
//
//    @RequestMapping(value = "/cadastro", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
//    public ResponseEntity<Response<Login>> cadastrar(@Valid @RequestBody Login login, BindingResult result) {
//        if (result.hasErrors()) {
//            List<String> erros = new ArrayList<String>();
//            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
//            return ResponseEntity.badRequest().body(new Response<Login>(erros));
//        }
//        return ResponseEntity.ok(new Response<Login>(this.loginService.cadastrar(login)));
//    }
//
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE})
//    public ResponseEntity<Response<Login>> atualizar(@PathVariable(name = "id") ObjectId id, @RequestBody Login login, BindingResult result) {
//        System.out.println("To aqui");
//        if (result.hasErrors()) {
//            List<String> erros = new ArrayList<String>();
//            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
//            return ResponseEntity.badRequest().body(new Response<Login>(erros));
//        }
//        login.set_id(id);
//        return ResponseEntity.ok(new Response<Login>(this.loginService.atualizar(login)));
//    }
//
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") ObjectId id) {
//        System.out.println("To aqui");
//        Login a = this.loginService.listarPorId(id);
//        System.out.println("Login encontrado " + a.toString());
//        this.loginService.remover(a);
//        return ResponseEntity.ok(new Response<Integer>(1));
//    }
//}
