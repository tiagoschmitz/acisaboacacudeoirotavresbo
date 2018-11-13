package com.udesc.ceavi.emds.observatorioeducacaobasica.model.dimensao;

import org.bson.types.ObjectId;

import java.util.List;

public class Dimensao {

    private ObjectId _id;
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

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
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
                "_id=" + _id +
                ", descricao='" + descricao + '\'' +
                ", dica='" + dica + '\'' +
                ", indicadores=" + indicadores +
                '}';
    }
}
