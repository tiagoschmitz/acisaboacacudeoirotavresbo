package com.udesc.ceavi.emds.observatorioeducacaobasica.services.implementations;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.formulario.Formulario;
import com.udesc.ceavi.emds.observatorioeducacaobasica.repository.FormularioRepository;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.FormularioService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormularioConcreta implements FormularioService {

    @Autowired
    private FormularioRepository formularioRepository;

    @Override
    public List<Formulario> listarTodos() {
        return formularioRepository.findAll();
    }

    @Override
    public Formulario listarPorId(ObjectId id) {
        return this.formularioRepository.findBy_id(id);
    }

    @Override
    public Formulario cadastrar(Formulario formulario) {
        return this.formularioRepository.save(formulario);
    }

    @Override
    public Formulario atualizar(Formulario formulario) {
        return this.formularioRepository.save(formulario);
    }

    @Override
    public void remover(Formulario formulario) {
        this.formularioRepository.delete(formulario);
    }
}
