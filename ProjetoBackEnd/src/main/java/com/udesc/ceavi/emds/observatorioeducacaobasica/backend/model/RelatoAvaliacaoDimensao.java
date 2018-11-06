package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "relatosAvaliacaoDimensoes")
public class RelatoAvaliacaoDimensao implements Serializable {
    @Id
    private Date dataAvaliacao;
    private Dimensao dimensao;
    private Mantida mantida;
    @Column(length = 2000)
    private String relatoDimensao;


}
