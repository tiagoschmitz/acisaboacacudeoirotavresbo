package com.udesc.ceavi.emds.observatorioeducacaobasica.model.dimensao;

public class Indicador {

    private String descricao;
    private String dica;

    public Indicador() {
    }

    public Indicador(String descricao, String dica) {
        this.descricao = descricao;
        this.dica = dica;
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

    @Override
    public String toString() {
        return "Indicador{" +
                "descricao='" + descricao + '\'' +
                ", dica='" + dica + '\'' +
                '}';
    }
}
