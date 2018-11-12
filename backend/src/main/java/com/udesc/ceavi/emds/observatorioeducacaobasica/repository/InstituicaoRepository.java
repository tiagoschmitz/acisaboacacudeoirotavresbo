package com.udesc.ceavi.emds.observatorioeducacaobasica.repository;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.instituicao.Instituicao;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InstituicaoRepository extends MongoRepository<Instituicao, String> {
    Instituicao findBy_id(ObjectId _id);
}
