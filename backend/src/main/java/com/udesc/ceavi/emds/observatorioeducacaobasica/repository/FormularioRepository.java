package com.udesc.ceavi.emds.observatorioeducacaobasica.repository;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.formulario.Formulario;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FormularioRepository extends MongoRepository<Formulario, String> {

    Formulario findBy_id(ObjectId _id);
}
