package com.udesc.ceavi.emds.observatorioeducacaobasica.services.implementations;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.instituicao.Instituicao;
import com.udesc.ceavi.emds.observatorioeducacaobasica.repository.InstituicaoRepository;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.InstituicaoService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InstituicaoConcreta implements InstituicaoService {

    @Autowired
    private InstituicaoRepository instituicaoRepository;

    @Override
    public List<Instituicao> listarTodos() {
        return instituicaoRepository.findAll();
    }

    @Override
    public Instituicao listarPorId(ObjectId id) {
        return this.instituicaoRepository.findBy_id(id);
    }

    @Override
    public Instituicao cadastrar(Instituicao instituicao) {
        return this.instituicaoRepository.save(instituicao);
    }

    @Override
    public Instituicao atualizar(Instituicao instituicao) {
        return this.instituicaoRepository.save(instituicao);
    }

    @Override
    public void remover(Instituicao instituicao) {
        this.instituicaoRepository.delete(instituicao);
    }
}
