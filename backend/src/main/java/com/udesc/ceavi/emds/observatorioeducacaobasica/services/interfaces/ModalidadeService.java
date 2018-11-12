package com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.modalidade.Modalidade;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ModalidadeService {

    List<Modalidade> listarTodos();

    Modalidade listarPorId(ObjectId id);

    Modalidade cadastrar(Modalidade modalidade);

    Modalidade atualizar(Modalidade modalidade);

    void remover(Modalidade modalidade);
}
