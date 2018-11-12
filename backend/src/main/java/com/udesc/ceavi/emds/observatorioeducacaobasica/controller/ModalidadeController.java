package com.udesc.ceavi.emds.observatorioeducacaobasica.controller;

import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.ModalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(path = "/modalidade")
public class ModalidadeController {

    @Autowired
    private ModalidadeService modalidadeService;
}
