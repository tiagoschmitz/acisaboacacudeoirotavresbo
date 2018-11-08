package com.udesc.ceavi.emds.observatorioeducacaobasica.services;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.Avaliacao;

import java.util.List;

public interface AvaliacaoService {

    List<Avaliacao> listarTodos();

    Avaliacao listarPorId(String id);

    Avaliacao cadastrar(Avaliacao avaliacao);

    Avaliacao atualizar(Avaliacao avaliacao);

    void remover(String id);
}
