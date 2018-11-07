package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dimensao implements Serializable {
    private long idDimensao;

    private FormularioAvaliacao formularioAvaliacao;

    private String descricaoDimensao;

    private List<Indicador> indicadores;

    public Dimensao() {
        indicadores = new ArrayList<Indicador>();
    }

    public Dimensao(FormularioAvaliacao formularioAvaliacao, String descricaoDimensao, List<Indicador> indicadores) {
//        this.formularioAvaliacao = formularioAvaliacao;
        this.descricaoDimensao = descricaoDimensao;
//        this.indicadores = indicadores;
        indicadores = new ArrayList<Indicador>();

    }
}
