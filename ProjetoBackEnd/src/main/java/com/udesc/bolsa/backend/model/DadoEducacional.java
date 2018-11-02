package com.udesc.bolsa.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DadoEducacional implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDadoEducacional;
    private Mantida mantida;
    private ModalidadeEnsino modalidadeEnsino;
    @Column(length = 10)
    private String turno;
    private int nroAlunos;
    private int nroTurmas;

}
