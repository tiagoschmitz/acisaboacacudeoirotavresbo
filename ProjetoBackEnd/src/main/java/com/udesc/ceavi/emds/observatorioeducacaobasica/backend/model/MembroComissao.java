package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class MembroComissao implements Serializable {
    @Id
    @Column(length = 75)
    private String nome;

    @Column(length = 75)
    private String orgaoExpedidor;
    private Date dataExpedicao;
    private Ato ato;
    private Mantida mantida;

}
