package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Table(name = "dimensao")
public class Dimensao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDimensao;
    private FormularioAvaliacao formularioAvaliacao;
    @Column(length = 75)
    private String descricaoDimensao;
}
