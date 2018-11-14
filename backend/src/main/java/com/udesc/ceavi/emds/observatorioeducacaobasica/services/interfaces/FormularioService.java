package com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.formulario.Formulario;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FormularioService {

    List<Formulario> listarTodos();

    Formulario listarPorId(ObjectId id);

    Formulario cadastrar(Formulario formulario);

    Formulario atualizar(Formulario formulario);

    void remover(Formulario formulario);
}
