package com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.Avaliacao;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AvaliacaoService {

    List<Avaliacao> listarTodos();

    Avaliacao listarPorId(ObjectId id);

    Avaliacao cadastrar(Avaliacao avaliacao);

    Avaliacao atualizar(Avaliacao avaliacao);

    void remover(Avaliacao avaliacao);
}
