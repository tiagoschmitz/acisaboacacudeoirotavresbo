package com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.instituicao.Instituicao;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InstituicaoService {

    List<Instituicao> listarTodos();

    Instituicao listarPorId(ObjectId id);

    Instituicao cadastrar(Instituicao instituicao);

    Instituicao atualizar(Instituicao instituicao);

    void remover(Instituicao instituicao);
}
