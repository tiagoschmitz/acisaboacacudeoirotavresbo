package com.udesc.ceavi.emds.observatorioeducacaobasica.model.formulario;

import java.util.List;

public class Indicador {

    private String descricao;
    private String dica;
    private Conceito conceito;
    private List<Criterio> criterios;


    public Indicador() {
    }

    public Indicador(String descricao, String dica, Conceito conceito, List<Criterio> criterios) {
        this.descricao = descricao;
        this.dica = dica;
        this.conceito = conceito;
        this.criterios = criterios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public Conceito getConceito() {
        return conceito;
    }

    public void setConceito(Conceito conceito) {
        this.conceito = conceito;
    }

    public List<Criterio> getCriterios() {
        return criterios;
    }

    public void setCriterios(List<Criterio> criterios) {
        this.criterios = criterios;
    }

    @Override
    public String toString() {
        return "Indicador{" +
                "descricao='" + descricao + '\'' +
                ", dica='" + dica + '\'' +
                ", conceito=" + conceito +
                ", criterios=" + criterios +
                '}';
    }
}
