package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "infraestrutura")
public class Infraestrutura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private long idInfraestrutura;
    private Mantida mantida;
    private Ambiente ambiente;
    private int quantidade;
    @Column(length = 35)
    private String descricaoOpcional;
}
