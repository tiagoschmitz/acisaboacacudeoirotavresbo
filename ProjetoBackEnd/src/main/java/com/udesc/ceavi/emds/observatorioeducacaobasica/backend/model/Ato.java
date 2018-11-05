package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="atos")
public class Ato implements Serializable {

    @Id
    private Date dataExpedicao;

    @Id
    @Column(length = 14)
    private String orgaoExpedidor;

    private Mantida mantida;

    @Id
    @Column(length = 25)
    private String nroAto;

    @Column(length = 10)
    private String tipoAto;

    @Column(length = 30)
    private String descricaoAto;


}
