package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "dimensoes")
public class Dimensao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDimensao;

    @Id
    @ManyToOne
    private FormularioAvaliacao formularioAvaliacao;

    @Column(length = 75)
    private String descricaoDimensao;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dimensao")
    private List<Indicador> indicadores;

    public Dimensao() {
    }

    public Dimensao(FormularioAvaliacao formularioAvaliacao, String descricaoDimensao, List<Indicador> indicadores) {
        this.formularioAvaliacao = formularioAvaliacao;
        this.descricaoDimensao = descricaoDimensao;
        this.indicadores = indicadores;
    }
}
