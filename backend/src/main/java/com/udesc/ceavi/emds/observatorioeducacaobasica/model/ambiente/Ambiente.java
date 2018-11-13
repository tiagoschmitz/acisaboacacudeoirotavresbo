package com.udesc.ceavi.emds.observatorioeducacaobasica.model.ambiente;

import org.bson.types.ObjectId;

public class Ambiente {

    private ObjectId _id;
    private String descricao;

    public Ambiente() {
    }

    public Ambiente(String descricao) {
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
        return "Ambiente{" +
                "_id=" + _id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
