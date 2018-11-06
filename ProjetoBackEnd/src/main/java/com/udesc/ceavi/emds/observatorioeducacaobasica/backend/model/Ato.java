package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "atos")
public class Ato implements Serializable {

    @Id
    private Date dataExpedicao;

    @Id
    @Column(length = 14)
    private String orgaoExpedidor;


    @ManyToOne
    @JoinColumn(name = "cnpjMantida")
    private Mantida mantida;

    @Id
    @Column(length = 25)
    private String nroAto;

    @Column(length = 10)
    private String tipoAto;

    @Column(length = 30)
    private String descricaoAto;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ato")
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
