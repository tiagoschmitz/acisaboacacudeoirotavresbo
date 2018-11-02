package com.udesc.bolsa.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class RelatoAvaliacaoDimensao implements Serializable {
    @Id
    private Date dataAvaliacao;
    private Dimensao dimensao;
    private Mantida mantida;
    @Column(length = 2000)
    private String relatoDimensao;


}
