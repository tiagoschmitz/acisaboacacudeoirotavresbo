package com.udesc.bolsa.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
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
