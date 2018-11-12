package com.udesc.ceavi.emds.observatorioeducacaobasica.services.implementations;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.modalidade.Modalidade;
import com.udesc.ceavi.emds.observatorioeducacaobasica.repository.ModalidadeRepository;
import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.ModalidadeService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModalidadeConcreta implements ModalidadeService {

    @Autowired
    private ModalidadeRepository modalidadeRepository;

    @Override
    public List<Modalidade> listarTodos() {
        return modalidadeRepository.findAll();
    }

    @Override
    public Modalidade listarPorId(ObjectId id) {
        return this.modalidadeRepository.findBy_id(id);
    }

    @Override
    public Modalidade cadastrar(Modalidade modalidade) {
        return this.modalidadeRepository.save(modalidade);
    }

    @Override
    public Modalidade atualizar(Modalidade modalidade) {
        return this.modalidadeRepository.save(modalidade);
    }

    @Override
    public void remover(Modalidade modalidade) {
        this.modalidadeRepository.delete(modalidade);
    }
}
