package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "conceitosIndicadores")
public class ConceitoIndicador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idConceito;
    private Indicador indicador;
    private Dimensao dimensao;
    private FormularioAvaliacao formularioAvaliacao;
    @Column(length = 20)
    private String descricaoConceito;
    private int qtdMinima;
    private int qtdMaxima;

    public ConceitoIndicador(Indicador indicador, Dimensao dimensao, FormularioAvaliacao formularioAvaliacao, String descricaoConceito, int qtdMinima, int qtdMaxima) {
        this.indicador = indicador;
        this.dimensao = dimensao;
        this.formularioAvaliacao = formularioAvaliacao;
        this.descricaoConceito = descricaoConceito;
        this.qtdMinima = qtdMinima;
        this.qtdMaxima = qtdMaxima;
    }

    public ConceitoIndicador() {
    }
}
