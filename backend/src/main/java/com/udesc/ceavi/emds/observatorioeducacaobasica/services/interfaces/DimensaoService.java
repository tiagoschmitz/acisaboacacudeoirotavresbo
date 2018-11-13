package com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.dimensao.Dimensao;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DimensaoService {

    List<Dimensao> listarTodos();

    Dimensao listarPorId(ObjectId id);

    Dimensao cadastrar(Dimensao dimensao);

    Dimensao atualizar(Dimensao dimensao);

    void remover(Dimensao dimensao);
}
