package com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.ambiente.Ambiente;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AmbienteService {

    List<Ambiente> listarTodos();

    Ambiente listarPorId(ObjectId id);

    Ambiente cadastrar(Ambiente ambiente);

    Ambiente atualizar(Ambiente ambiente);

    void remover(Ambiente ambiente);
}
