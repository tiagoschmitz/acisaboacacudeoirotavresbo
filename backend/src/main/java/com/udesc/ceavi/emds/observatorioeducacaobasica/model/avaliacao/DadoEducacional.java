package com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao;

public class DadoEducacional {

    private String descricaoModalidade;

    private String turno;
    private int nroAlunos;
    private int nroTurmas;

      public DadoEducacional() {
    }

    public DadoEducacional(String descricaoModalidade, String turno, int nroAlunos, int nroTurmas) {
        this.descricaoModalidade = descricaoModalidade;
        this.turno = turno;
        this.nroAlunos = nroAlunos;
        this.nroTurmas = nroTurmas;
    }

    public String getDescricaoModalidade() {
        return descricaoModalidade;
    }

    public void setDescricaoModalidade(String descricaoModalidade) {
        this.descricaoModalidade = descricaoModalidade;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getNroAlunos() {
        return nroAlunos;
    }

    public void setNroAlunos(int nroAlunos) {
        this.nroAlunos = nroAlunos;
    }

    public int getNroTurmas() {
        return nroTurmas;
    }

    public void setNroTurmas(int nroTurmas) {
        this.nroTurmas = nroTurmas;
    }
}
