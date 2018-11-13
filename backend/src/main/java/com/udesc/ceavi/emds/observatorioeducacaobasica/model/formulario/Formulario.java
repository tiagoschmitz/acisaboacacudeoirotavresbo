package com.udesc.ceavi.emds.observatorioeducacaobasica.model.formulario;

import org.bson.types.ObjectId;

import java.util.List;

public class Formulario {

    private ObjectId _id;
    private int versao;
    private List<Dimensao> dimensoes;

    public Formulario() {
    }

    public Formulario(int versao, List<Dimensao> dimensoes) {
        this.versao = versao;
        this.dimensoes = dimensoes;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public List<Dimensao> getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(List<Dimensao> dimensoes) {
        this.dimensoes = dimensoes;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "_id=" + _id +
                ", versao=" + versao +
                ", dimensoes=" + dimensoes +
                '}';
    }
}
