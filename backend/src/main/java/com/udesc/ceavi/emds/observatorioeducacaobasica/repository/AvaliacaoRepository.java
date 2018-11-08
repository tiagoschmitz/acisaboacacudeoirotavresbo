package com.udesc.ceavi.emds.observatorioeducacaobasica.repository;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.Avaliacao;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AvaliacaoRepository extends MongoRepository<Avaliacao, String> {
    Avaliacao findBy_id(ObjectId _id);

}
