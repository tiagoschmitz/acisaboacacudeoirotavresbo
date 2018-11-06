package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "criterios")
public class Criterio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCriterio;

    @ManyToOne
    @JoinColumn(name = "idIndicador")
    private Indicador indicador;

    private Dimensao dimensao;
    private FormularioAvaliacao formularioAvaliacao;
    @Column(length = 75)
    private String descricaoCriterio;


    public Criterio() {
    }

    public Criterio(Indicador indicador, Dimensao dimensao, FormularioAvaliacao formularioAvaliacao, String descricaoCriterio) {
        this.indicador = indicador;
        this.dimensao = dimensao;
        this.formularioAvaliacao = formularioAvaliacao;
        this.descricaoCriterio = descricaoCriterio;
    }
}
