package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "membroComissao")
public class MembroComissao implements Serializable {
    @Id
    @Column(length = 11)
    private String cpf;


    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "ato_orgao_expedidor", referencedColumnName = "orgaoExpedidor"),
            @JoinColumn(name = "ato_nro_ato", referencedColumnName = "nroAto"),
            @JoinColumn(name = "ato_mantida", referencedColumnName = "mantida"),
            @JoinColumn(name = "ato_data_expedicao", referencedColumnName = "dataExpedicao")
    })
    private Ato ato;

    @Column(length = 75)
    private String nome;


    public MembroComissao(String cpf, String nome, Ato ato) {
        this.cpf = cpf;
        this.nome = nome;
        this.ato = ato;
    }

    public MembroComissao() {
    }
}
