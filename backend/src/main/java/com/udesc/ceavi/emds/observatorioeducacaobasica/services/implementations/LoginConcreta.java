package com.udesc.ceavi.emds.observatorioeducacaobasica.services.implementations;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.login.Login;
import com.udesc.ceavi.emds.observatorioeducacaobasica.repository.LoginRepository;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.LoginService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginConcreta implements LoginService {
    @Autowired
    private LoginRepository loginRepository;

    @Override
    public List<Login> getAllUsers() {
        return loginRepository.findAll();
    }

    @Override
    public Login cadastrar(Login login) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String h = passwordEncoder.encode(login.getSenha());
        login.setSenha(h);
        return loginRepository.save(login);
    }

    @Override
    public void remover(Login login) {
        this.loginRepository.delete(login);
    }
}
