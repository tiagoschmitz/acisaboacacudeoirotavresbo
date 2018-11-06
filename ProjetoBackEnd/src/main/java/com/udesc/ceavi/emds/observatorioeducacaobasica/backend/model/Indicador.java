package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "indicadores")
public class Indicador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idIndicador;

    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "dimensao_idDimensao", referencedColumnName = "idDimensao"),
            @JoinColumn(name = "dimensao_idFormulario", referencedColumnName = "formularioAvaliacao")
    })
    private Dimensao dimensao;

    private FormularioAvaliacao formularioAvaliacao;
    @Column(length = 75)
    private String descricaoIndicador;
    @Column(length = 700)
    private String glossario;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "criterio")
    private List<Criterio> criterios;

}
