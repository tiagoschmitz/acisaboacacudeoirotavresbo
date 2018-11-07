package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import java.io.Serializable;

public class Indicador implements Serializable {
    private long idIndicador;

    private Dimensao dimensao;

    private String descricaoIndicador;
    private String glossario;

    public Indicador() {
//        this.criterios = new ArrayList<Criterio>();
    }

    public Indicador(Dimensao dimensao, String descricaoIndicador, String glossario) {
        this.dimensao = dimensao;
        this.descricaoIndicador = descricaoIndicador;
        this.glossario = glossario;
//        this.criterios = new ArrayList<Criterio>();
    }
}
