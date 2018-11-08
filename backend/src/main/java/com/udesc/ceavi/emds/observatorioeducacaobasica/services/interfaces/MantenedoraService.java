package com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.Mantenedora;

import java.util.List;
import java.util.Optional;

public interface MantenedoraService {
    List<Mantenedora> listarTodos();

    Mantenedora listarPorId(String id);

    Mantenedora cadastrar(Mantenedora mantenedora);

    Mantenedora atualizar(Mantenedora mantenedora);

    void remover(String id);
}
