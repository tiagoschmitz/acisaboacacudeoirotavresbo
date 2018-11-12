package com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.instituicao.Instituicao;
import org.bson.types.ObjectId;

import java.util.List;

public interface InstituicaoService {

    List<Instituicao> listarTodos();

    Instituicao listarPorId(ObjectId id);

    Instituicao cadastrar(Instituicao instituicao);

    Instituicao atualizar(Instituicao instituicao);

    void remover(Instituicao instituicao);
}
