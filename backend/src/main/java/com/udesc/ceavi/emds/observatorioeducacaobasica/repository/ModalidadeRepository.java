package com.udesc.ceavi.emds.observatorioeducacaobasica.repository;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.modalidade.Modalidade;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ModalidadeRepository extends MongoRepository<Modalidade, String> {
    Modalidade findBy_id(ObjectId _id);
}
