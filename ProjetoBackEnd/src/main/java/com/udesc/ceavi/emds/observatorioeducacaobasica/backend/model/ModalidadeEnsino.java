package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ModalidadeEnsino implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idModalidadeEnsino;

    @Column(length = 35)
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modalidadeEnsino")
    private List<DadoEducacional> dadosEducacionais;

    public ModalidadeEnsino() {
        dadosEducacionais = new ArrayList<>();
    }

    public ModalidadeEnsino(String descricao, List<DadoEducacional> dadosEducacionais) {
        this.descricao = descricao;
        this.dadosEducacionais = dadosEducacionais;
    }
}
