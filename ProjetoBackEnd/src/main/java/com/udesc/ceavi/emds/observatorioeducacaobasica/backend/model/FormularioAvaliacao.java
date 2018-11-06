package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "formulariosAvaliacao")
public class FormularioAvaliacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idFormulario;

    @ManyToMany(mappedBy = "formularios")
    private List<MembroComissao> membros;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formularioAvaliacao")
    private List<Dimensao> dimensoes;

    public FormularioAvaliacao() {
        membros = new ArrayList<>();
    }

    public FormularioAvaliacao(List<MembroComissao> membros) {
        this.membros = membros;
    }
}
