package com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

@Document
public class Avaliacao {
    @Id
    public ObjectId _id;
    private int corpoAdministrativo;
    private int corpoDocente;
    private int corpoOutros;
    private boolean participouEducacenso;

    private Comissao comissao;

    private DadoEducacional dadoEducacional;

    private Infraestrutura infraestrutura;

    private Dimensao dimensao;

    public Avaliacao() {
    }

    public Avaliacao(int corpoAdministrativo, int corpoDocente, int corpoOutros, boolean participouEducacenso, Comissao comissao, DadoEducacional dadoEducacional, Infraestrutura infraestrutura, Dimensao dimensao) {
        this.corpoAdministrativo = corpoAdministrativo;
        this.corpoDocente = corpoDocente;
        this.corpoOutros = corpoOutros;
        this.participouEducacenso = participouEducacenso;
        this.comissao = comissao;
        this.dadoEducacional = dadoEducacional;
        this.infraestrutura = infraestrutura;
        this.dimensao = dimensao;
    }

    public int getCorpoAdministrativo() {
        return corpoAdministrativo;
    }

    public void setCorpoAdministrativo(int corpoAdministrativo) {
        this.corpoAdministrativo = corpoAdministrativo;
    }

    public int getCorpoDocente() {
        return corpoDocente;
    }

    public void setCorpoDocente(int corpoDocente) {
        this.corpoDocente = corpoDocente;
    }

    public int getCorpoOutros() {
        return corpoOutros;
    }

    public void setCorpoOutros(int corpoOutros) {
        this.corpoOutros = corpoOutros;
    }

    public boolean isParticipouEducacenso() {
        return participouEducacenso;
    }

    public void setParticipouEducacenso(boolean participouEducacenso) {
        this.participouEducacenso = participouEducacenso;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public DadoEducacional getDadoEducacional() {
        return dadoEducacional;
    }

    public void setDadoEducacional(DadoEducacional dadoEducacional) {
        this.dadoEducacional = dadoEducacional;
    }

    public Infraestrutura getInfraestrutura() {
        return infraestrutura;
    }

    public void setInfraestrutura(Infraestrutura infraestrutura) {
        this.infraestrutura = infraestrutura;
    }

    public Dimensao getDimensao() {
        return dimensao;
    }

    public void setDimensao(Dimensao dimensao) {
        this.dimensao = dimensao;
    }


    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "corpoAdministrativo=" + corpoAdministrativo +
                ", corpoDocente=" + corpoDocente +
                ", corpoOutros=" + corpoOutros +
                ", participouEducacenso=" + participouEducacenso +
                ", comissao=" + comissao +
                ", dadoEducacional=" + dadoEducacional +
                ", infraestrutura=" + infraestrutura +
                ", dimensao=" + dimensao +
                '}';
    }
}
