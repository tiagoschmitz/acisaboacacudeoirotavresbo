package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Criterio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCriterio;


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumns({
//            @JoinColumn(name = "indicador_idIndicador", referencedColumnName = "idIndicador"),
//            @JoinColumn(name = "indicador_idDimensao", referencedColumnName = "dimensao")
//    })
//    private Indicador indicador;

    private Dimensao dimensao;
    private FormularioAvaliacao formularioAvaliacao;
    @Column(length = 75)
    private String descricaoCriterio;


    public Criterio() {
    }

    public Criterio(Indicador indicador, Dimensao dimensao, FormularioAvaliacao formularioAvaliacao, String descricaoCriterio) {
//        this.indicador = indicador;
        this.dimensao = dimensao;
        this.formularioAvaliacao = formularioAvaliacao;
        this.descricaoCriterio = descricaoCriterio;
    }
}
