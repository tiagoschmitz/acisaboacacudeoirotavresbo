package com.udesc.ceavi.emds.observatorioeducacaobasica.services.implementations;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.ambiente.Ambiente;
import com.udesc.ceavi.emds.observatorioeducacaobasica.repository.AmbienteRepository;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.AmbienteService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmbienteConcreta implements AmbienteService {

    @Autowired
    private AmbienteRepository ambienteRepository;

    @Override
    public List<Ambiente> listarTodos() {
        return ambienteRepository.findAll();
    }

    @Override
    public Ambiente listarPorId(ObjectId id) {
        return this.ambienteRepository.findBy_id(id);
    }

    @Override
    public Ambiente cadastrar(Ambiente ambiente) {
        return this.ambienteRepository.save(ambiente);
    }

    @Override
    public Ambiente atualizar(Ambiente ambiente) {
        return this.ambienteRepository.save(ambiente);
    }

    @Override
    public void remover(Ambiente ambiente) {
        this.ambienteRepository.delete(ambiente);
    }
}
