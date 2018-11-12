package com.udesc.ceavi.emds.observatorioeducacaobasica.repository;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.ambiente.Ambiente;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AmbienteRepository extends MongoRepository<Ambiente, String> {
        Ambiente findBy_id(ObjectId _id);
}
