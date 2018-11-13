package com.udesc.ceavi.emds.observatorioeducacaobasica.repository;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.dimensao.Dimensao;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DimensaoRepository extends MongoRepository<Dimensao, String> {

    Dimensao findBy_id(ObjectId _id);
}
