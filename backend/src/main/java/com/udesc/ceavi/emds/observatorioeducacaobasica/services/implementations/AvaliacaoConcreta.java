package com.udesc.ceavi.emds.observatorioeducacaobasica.services.implementations;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.Avaliacao;
import com.udesc.ceavi.emds.observatorioeducacaobasica.repository.AvaliacaoRepository;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.AvaliacaoService;
import org.bson.types.ObjectId;
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
    public Avaliacao listarPorId(ObjectId id) {
        return this.avaliacaoRepository.findBy_id(id);
    }

    @Override
    public Avaliacao cadastrar(Avaliacao avaliacao) {
        return this.avaliacaoRepository.save(avaliacao);
    }

    @Override
    public Avaliacao atualizar(Avaliacao avaliacao) {
        return this.avaliacaoRepository.save(avaliacao);
    }

    @Override
    public void remover(Avaliacao avaliacao) {
        this.avaliacaoRepository.delete(avaliacao);
    }
}