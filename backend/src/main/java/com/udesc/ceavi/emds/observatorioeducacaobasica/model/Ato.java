package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ato implements Serializable {

    private Date dataExpedicao;

    private String orgaoExpedidor;

    private String nroAto;

    private String tipoAto;

    private String descricaoAto;

    public Ato() {

    }

    public Ato(Date dataExpedicao, String orgaoExpedidor, Mantida mantida, String nroAto, String tipoAto, String descricaoAto) {
        this.dataExpedicao = dataExpedicao;
        this.orgaoExpedidor = orgaoExpedidor;
        this.nroAto = nroAto;
        this.tipoAto = tipoAto;
        this.descricaoAto = descricaoAto;
    }

}
