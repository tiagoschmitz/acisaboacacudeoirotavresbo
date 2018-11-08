package com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao;

import java.util.List;

public class Dimensao {


    private String descricaoDimensao;

    private String relatoOpcional;

    private List<Indicador> indicadores;

    public Dimensao() {
    }

    public Dimensao(String descricaoDimensao, String descricaoDimensaoOpcional, List<Indicador> indicadores) {
        this.descricaoDimensao = descricaoDimensao;
        this.relatoOpcional = descricaoDimensaoOpcional;
        this.indicadores = indicadores;
    }

    public String getDescricaoDimensao() {
        return descricaoDimensao;
    }

    public void setDescricaoDimensao(String descricaoDimensao) {
        this.descricaoDimensao = descricaoDimensao;
    }

    public String getRelatoOpcional() {
        return relatoOpcional;
    }

    public void setRelatoOpcional(String relatoOpcional) {
        this.relatoOpcional = relatoOpcional;
    }

    public List<Indicador> getIndicadores() {
        return indicadores;
    }

    public void setIndicadores(List<Indicador> indicadores) {
        this.indicadores = indicadores;
    }
}

