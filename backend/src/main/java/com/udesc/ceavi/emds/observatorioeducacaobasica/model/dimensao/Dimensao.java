package com.udesc.ceavi.emds.observatorioeducacaobasica.model.dimensao;

import org.bson.types.ObjectId;

public class Dimensao {

    private ObjectId _id;


    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }
}
