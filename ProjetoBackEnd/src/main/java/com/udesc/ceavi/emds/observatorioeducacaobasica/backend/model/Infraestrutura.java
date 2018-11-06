package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "infraestruturas")
public class Infraestrutura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private long idInfraestrutura;

    @ManyToOne
    @JoinColumn(name = "cnpjMantida")
    private Mantida mantida;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "infraestrutura")
    private List<Ambiente> ambientes;

    private int quantidade;

    @Column(length = 35)
    private String descricaoOpcional;

    public Infraestrutura() {
        this.ambientes = new ArrayList<>();
    }

    public Infraestrutura(long idInfraestrutura, Mantida mantida, List<Ambiente> ambientes, int quantidade, String descricaoOpcional) {
        this.idInfraestrutura = idInfraestrutura;
        this.mantida = mantida;
        this.ambientes = ambientes;
        this.quantidade = quantidade;
        this.descricaoOpcional = descricaoOpcional;
        this.ambientes = new ArrayList<>();

    }
}
