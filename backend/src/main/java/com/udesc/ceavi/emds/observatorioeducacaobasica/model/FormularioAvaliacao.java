package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.Dimensao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FormularioAvaliacao implements Serializable {
    private long idFormulario;

    private List<MembroComissao> membros;

    private List<Dimensao> dimensoes;

    public FormularioAvaliacao() {
        membros = new ArrayList<MembroComissao>();
    }

    public FormularioAvaliacao(List<MembroComissao> membros) {
        this.membros = membros;
    }
}
