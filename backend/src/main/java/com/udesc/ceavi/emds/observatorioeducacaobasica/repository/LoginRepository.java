package com.udesc.ceavi.emds.observatorioeducacaobasica.repository;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.login.Login;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LoginRepository extends MongoRepository<Login, String> {
    Login findByCnpj(String cnpj);

}
