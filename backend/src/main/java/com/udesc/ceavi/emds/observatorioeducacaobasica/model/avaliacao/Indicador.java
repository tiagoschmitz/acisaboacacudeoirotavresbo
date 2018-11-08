package com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao;

import java.util.List;

public class Indicador {


    private String descricaoIndicador;
    private int conceito;

    private List<Criterio> criterios;


    public Indicador() {
    }

    public Indicador(String descricaoIndicador, int conceito, List<Criterio> criterios) {
        this.descricaoIndicador = descricaoIndicador;
        this.conceito = conceito;
        this.criterios = criterios;
    }

    public String getDescricaoIndicador() {
        return descricaoIndicador;
    }

    public void setDescricaoIndicador(String descricaoIndicador) {
        this.descricaoIndicador = descricaoIndicador;
    }

    public int getConceito() {
        return conceito;
    }

    public void setConceito(int conceito) {
        this.conceito = conceito;
    }

    public List<Criterio> getCriterios() {
        return criterios;
    }

    public void setCriterios(List<Criterio> criterios) {
        this.criterios = criterios;
    }
}