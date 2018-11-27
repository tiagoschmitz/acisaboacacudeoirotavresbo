package com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.login.Login;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoginService {
    List<Login> getAllUsers();

    Login cadastrar(Login login);

    void remover(Login login);

}
