package com.udesc.ceavi.emds.observatorioeducacaobasica.model.formulario;

public class Criterio {

    private String descricao;

    public Criterio() {
    }

    public Criterio(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Criterio{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
