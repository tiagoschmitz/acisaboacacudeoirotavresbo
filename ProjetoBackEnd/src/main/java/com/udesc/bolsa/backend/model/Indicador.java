package com.udesc.bolsa.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Indicador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idIndicador;
    private Dimensao dimensao;
    private FormularioAvaliacao formularioAvaliacao;
    @Column(length = 75)
    private String descricaoIndicador;
    @Column(length = 700)
    private String glossario;

}
