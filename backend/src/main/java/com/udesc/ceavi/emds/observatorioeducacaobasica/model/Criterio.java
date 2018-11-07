package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import java.io.Serializable;

public class Criterio implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idCriterio;


    private Indicador indicador;

    private Dimensao dimensao;
    private FormularioAvaliacao formularioAvaliacao;
    private String descricaoCriterio;


    public Criterio() {
    }

    public Criterio(Indicador indicador, Dimensao dimensao, FormularioAvaliacao formularioAvaliacao, String descricaoCriterio) {
//        this.indicador = indicador;
        this.dimensao = dimensao;
        this.formularioAvaliacao = formularioAvaliacao;
        this.descricaoCriterio = descricaoCriterio;
    }
}
