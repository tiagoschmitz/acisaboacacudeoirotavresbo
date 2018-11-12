package com.udesc.ceavi.emds.observatorioeducacaobasica.services.implementations;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.login.Login;
import com.udesc.ceavi.emds.observatorioeducacaobasica.repository.LoginRepository;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.LoginService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LoginConcreta implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public List<Login> listarTodos() {
        return loginRepository.findAll();
    }

    @Override
    public Login listarPorId(ObjectId id) {
        return this.loginRepository.findBy_id(id);
    }

    @Override
    public Login cadastrar(Login login) {
        return this.loginRepository.save(login);
    }

    @Override
    public Login atualizar(Login login) {
        return this.loginRepository.save(login);
    }

    @Override
    public void remover(Login login) {
        this.loginRepository.delete(login);
    }
}
