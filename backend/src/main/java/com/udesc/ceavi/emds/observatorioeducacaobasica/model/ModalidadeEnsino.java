package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ModalidadeEnsino implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idModalidadeEnsino;

    private String descricao;

    private List<DadoEducacional> dadosEducacionais;

    public ModalidadeEnsino() {
        dadosEducacionais = new ArrayList<>();
    }

    public ModalidadeEnsino(String descricao, List<DadoEducacional> dadosEducacionais) {
        this.descricao = descricao;
        this.dadosEducacionais = dadosEducacionais;
    }
}
