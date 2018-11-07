package com.udesc.ceavi.emds.observatorioeducacaobasica.services;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.Mantenedora;
import com.udesc.ceavi.emds.observatorioeducacaobasica.repository.MantenedoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MantenedoraImpl implements MantenedoraService {

    @Autowired
    private MantenedoraRepository mantenedoraRepository;

    @Override
    public List<Mantenedora> listarTodos() {
        return mantenedoraRepository.findAll();
    }

    @Override
    public Mantenedora listarPorId(String id) {
//        return this.mantenedoraRepository.findById(id);
        return null;
    }

    @Override
    public Mantenedora cadastrar(Mantenedora mantenedora) {
        return this.mantenedoraRepository.save(mantenedora);
    }

    @Override
    public Mantenedora atualizar(Mantenedora mantenedora) {
        return this.mantenedoraRepository.save(mantenedora);
    }

    @Override
    public void remover(String id) {
        this.mantenedoraRepository.deleteById(id);
    }
}
