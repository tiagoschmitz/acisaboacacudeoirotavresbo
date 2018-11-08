package com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao;

import java.util.Date;

public class Ato {

    private Date dataExpedicao;

    private String orgaoExpedidor;

    private String nroAto;

    private String tipoAto;

    private String descricaoAto;

    public Ato() {

    }

    public Ato(Date dataExpedicao, String orgaoExpedidor, String nroAto, String tipoAto, String descricaoAto) {
        this.dataExpedicao = dataExpedicao;
        this.orgaoExpedidor = orgaoExpedidor;
        this.nroAto = nroAto;
        this.tipoAto = tipoAto;
        this.descricaoAto = descricaoAto;
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
                "dataExpedicao=" + dataExpedicao +
                ", orgaoExpedidor='" + orgaoExpedidor + '\'' +
                ", nroAto='" + nroAto + '\'' +
                ", tipoAto='" + tipoAto + '\'' +
                ", descricaoAto='" + descricaoAto + '\'' +
                '}';
    }
}
