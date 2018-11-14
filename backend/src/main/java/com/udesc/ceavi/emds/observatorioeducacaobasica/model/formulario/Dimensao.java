package com.udesc.ceavi.emds.observatorioeducacaobasica.model.formulario;

import org.bson.types.ObjectId;

import java.util.List;

public class Dimensao {


    private String descricao;
    private String dica;
    private List<Indicador> indicadores;

    public Dimensao() {
    }

    public Dimensao(String descricao, String dica, List<Indicador> indicadores) {
        this.descricao = descricao;
        this.dica = dica;
        this.indicadores = indicadores;
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

    public List<Indicador> getIndicadores() {
        return indicadores;
    }

    public void setIndicadores(List<Indicador> indicadores) {
        this.indicadores = indicadores;
    }

    @Override
    public String toString() {
        return "Dimensao{" +
                ", descricao='" + descricao + '\'' +
                ", dica='" + dica + '\'' +
                ", indicadores=" + indicadores +
                '}';
    }
}
