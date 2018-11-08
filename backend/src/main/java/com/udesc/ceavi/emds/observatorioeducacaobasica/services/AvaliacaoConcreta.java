package com.udesc.ceavi.emds.observatorioeducacaobasica.services;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.Avaliacao;
import com.udesc.ceavi.emds.observatorioeducacaobasica.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoConcreta implements AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @Override
    public List<Avaliacao> listarTodos() {
        return avaliacaoRepository.findAll();
    }

    @Override
    public Avaliacao listarPorId(String id) {
//        return this.avaliacaoRepository.findById(id);
        return null;
    }

    @Override
    public Avaliacao cadastrar(Avaliacao mantenedora) {
        return this.avaliacaoRepository.save(mantenedora);
    }

    @Override
    public Avaliacao atualizar(Avaliacao mantenedora) {
        return this.avaliacaoRepository.save(mantenedora);
    }

    @Override
    public void remover(String id) {
        this.avaliacaoRepository.deleteById(id);
    }
}