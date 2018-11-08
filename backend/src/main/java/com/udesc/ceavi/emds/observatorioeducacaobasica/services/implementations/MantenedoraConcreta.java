package com.udesc.ceavi.emds.observatorioeducacaobasica.services.implementations;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.Mantenedora;
import com.udesc.ceavi.emds.observatorioeducacaobasica.repository.MantenedoraRepository;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.MantenedoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MantenedoraConcreta implements MantenedoraService {

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
