package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
//@Table(name="atos")
public class Ato implements Serializable {

    @Id
    private Date dataExpedicao;

    @Id
    @Column(length = 14)
    private String orgaoExpedidor;

    @Id
    @OneToOne
    @JoinColumn(name = "cnpjMantida", nullable = false)
    private Mantida mantida;

    @Id
    @Column(length = 25)
    private String nroAto;

    @Column(length = 10)
    private String tipoAto;

    @Column(length = 30)
    private String descricaoAto;

    public Ato() {
    }

    public Ato(Date dataExpedicao, String orgaoExpedidor, Mantida mantida, String nroAto, String tipoAto, String descricaoAto) {
        this.dataExpedicao = dataExpedicao;
        this.orgaoExpedidor = orgaoExpedidor;
        this.mantida = mantida;
        this.nroAto = nroAto;
        this.tipoAto = tipoAto;
        this.descricaoAto = descricaoAto;
    }
}
