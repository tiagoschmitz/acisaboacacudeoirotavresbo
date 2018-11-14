//package com.udesc.ceavi.emds.observatorioeducacaobasica.services.implementations;
//
//import com.udesc.ceavi.emds.observatorioeducacaobasica.model.dimensao.Dimensao;
//import com.udesc.ceavi.emds.observatorioeducacaobasica.repository.DimensaoRepository;
//import com.udesc.ceavi.emds.observatorioeducacaobasica.services.interfaces.DimensaoService;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//public class DimensaoConcreta implements DimensaoService {
//
//    @Autowired
//    private DimensaoRepository dimensaoRepository;
//
//    @Override
//    public List<Dimensao> listarTodos() {
//        return dimensaoRepository.findAll();
//    }
//
//    @Override
//    public Dimensao listarPorId(ObjectId id) {
//        return this.dimensaoRepository.findBy_id(id);
//    }
//
//    @Override
//    public Dimensao cadastrar(Dimensao dimensao) {
//        return this.dimensaoRepository.save(dimensao);
//    }
//
//    @Override
//    public Dimensao atualizar(Dimensao dimensao) {
//        return this.dimensaoRepository.save(dimensao);
//    }
//
//    @Override
//    public void remover(Dimensao dimensao) {
//        this.dimensaoRepository.delete(dimensao);
//    }
//}
