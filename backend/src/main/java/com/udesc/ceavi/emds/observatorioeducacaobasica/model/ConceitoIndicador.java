package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import java.io.Serializable;

public class ConceitoIndicador implements Serializable {
    private long idConceito;
    private Indicador indicador;
    private Dimensao dimensao;
    private FormularioAvaliacao formularioAvaliacao;
    private String descricaoConceito;
    private int qtdMinima;
    private int qtdMaxima;

    public ConceitoIndicador(Indicador indicador, Dimensao dimensao, FormularioAvaliacao formularioAvaliacao, String descricaoConceito, int qtdMinima, int qtdMaxima) {
        this.indicador = indicador;
        this.dimensao = dimensao;
        this.formularioAvaliacao = formularioAvaliacao;
        this.descricaoConceito = descricaoConceito;
        this.qtdMinima = qtdMinima;
        this.qtdMaxima = qtdMaxima;
    }

    public ConceitoIndicador() {
    }
}
