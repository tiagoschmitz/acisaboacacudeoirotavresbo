package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Infraestrutura implements Serializable {
    private long idInfraestrutura;

    private Mantida mantida;

    private List<Ambiente> ambientes;

    private int quantidade;

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
