package com.udesc.ceavi.emds.observatorioeducacaobasica.model.modalidade;

import org.bson.types.ObjectId;

public class Modalidade {

    private ObjectId _id;
    private String descricao;

    public Modalidade() {
    }

    public Modalidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return "Modalidade{" +
                "_id=" + _id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
