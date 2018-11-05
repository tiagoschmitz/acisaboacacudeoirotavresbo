package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Table(name = "dadosEducacionais")
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

    public DadoEducacional(Mantida mantida, ModalidadeEnsino modalidadeEnsino, String turno, int nroAlunos, int nroTurmas) {
        this.mantida = mantida;
        this.modalidadeEnsino = modalidadeEnsino;
        this.turno = turno;
        this.nroAlunos = nroAlunos;
        this.nroTurmas = nroTurmas;
    }

    public DadoEducacional() {
    }
}
