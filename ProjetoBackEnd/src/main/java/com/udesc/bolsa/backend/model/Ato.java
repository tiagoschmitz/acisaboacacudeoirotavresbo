package com.udesc.bolsa.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Ato {
    @Id
    @Column(length = 14)
    private String cnpjMantida;

    @Id
    private Date dataExpedicao;

    @Id
    @Column(length = 14)
    private String orgaoExpedidor;

    @Id
    @Column(length = 25)
    private String nroAto;

    @Column(length = 10)
    private String tipoAto;

    @Column(length = 30)
    private String descricaoAto;

    public Ato() {
    }

    public Ato(String cnpjMantida, Date dataExpedicao, String orgaoExpedidor, String nroAto, String tipoAto, String descricaoAto) {
        this.cnpjMantida = cnpjMantida;
        this.dataExpedicao = dataExpedicao;
        this.orgaoExpedidor = orgaoExpedidor;
        this.nroAto = nroAto;
        this.tipoAto = tipoAto;
        this.descricaoAto = descricaoAto;
    }

    public String getCnpjMantida() {
        return cnpjMantida;
    }

    public void setCnpjMantida(String cnpjMantida) {
        this.cnpjMantida = cnpjMantida;
    }

    public Date getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(Date dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public String getNroAto() {
        return nroAto;
    }

    public void setNroAto(String nroAto) {
        this.nroAto = nroAto;
    }

    public String getTipoAto() {
        return tipoAto;
    }

    public void setTipoAto(String tipoAto) {
        this.tipoAto = tipoAto;
    }

    public String getDescricaoAto() {
        return descricaoAto;
    }

    public void setDescricaoAto(String descricaoAto) {
        this.descricaoAto = descricaoAto;
    }

    @Override
    public String toString() {
        return "Ato{" +
                "cnpjMantida='" + cnpjMantida + '\'' +
                ", dataExpedicao=" + dataExpedicao +
                ", orgaoExpedidor='" + orgaoExpedidor + '\'' +
                ", nroAto='" + nroAto + '\'' +
                ", tipoAto='" + tipoAto + '\'' +
                ", descricaoAto='" + descricaoAto + '\'' +
                '}';
    }
}
