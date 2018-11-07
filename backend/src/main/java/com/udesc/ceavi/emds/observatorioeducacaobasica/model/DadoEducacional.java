package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import java.io.Serializable;

public class DadoEducacional implements Serializable {
    private long idDadoEducacional;

    private Mantida mantida;

    private ModalidadeEnsino modalidadeEnsino;

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
