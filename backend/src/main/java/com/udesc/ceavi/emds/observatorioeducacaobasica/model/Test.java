package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;

@Document
public class Test {

    private String teste;

    public Test(String teste) {
        this.teste = teste;
    }

    public Test() {
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }
}
