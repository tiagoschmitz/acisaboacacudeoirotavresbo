package com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao;

public class Criterio {


    private String descricaoCriterio;
    private boolean atende;


    public Criterio() {
    }

    public Criterio(String descricaoCriterio, boolean atende) {
        this.descricaoCriterio = descricaoCriterio;
        this.atende = atende;
    }

    public String getDescricaoCriterio() {
        return descricaoCriterio;
    }

    public void setDescricaoCriterio(String descricaoCriterio) {
        this.descricaoCriterio = descricaoCriterio;
    }

    public boolean isAtende() {
        return atende;
    }

    public void setAtende(boolean atende) {
        this.atende = atende;
    }
}
