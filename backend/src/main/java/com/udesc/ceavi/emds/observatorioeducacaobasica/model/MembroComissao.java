package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.Ato;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MembroComissao implements Serializable {
    private String cpf;

    private Ato ato;

    private String nome;

    private List<FormularioAvaliacao> formularios;


    public MembroComissao(String cpf, String nome, Ato ato) {
        this.cpf = cpf;
        this.nome = nome;
        this.ato = ato;
        this.formularios = new ArrayList<FormularioAvaliacao>();
    }

    public MembroComissao() {
        this.formularios = new ArrayList<FormularioAvaliacao>();

    }
}
