package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ato implements Serializable {

    private Date dataExpedicao;

    private String orgaoExpedidor;


    private Mantida mantida;

    private String nroAto;

    private String tipoAto;

    private String descricaoAto;

    private List<MembroComissao> membros;

    public Ato() {
        this.membros = new ArrayList<>();

    }

    public Ato(Date dataExpedicao, String orgaoExpedidor, Mantida mantida, String nroAto, String tipoAto, String descricaoAto) {
        this.dataExpedicao = dataExpedicao;
        this.orgaoExpedidor = orgaoExpedidor;
        this.mantida = mantida;
        this.nroAto = nroAto;
        this.tipoAto = tipoAto;
        this.descricaoAto = descricaoAto;
        this.membros = new ArrayList<>();
    }

}
