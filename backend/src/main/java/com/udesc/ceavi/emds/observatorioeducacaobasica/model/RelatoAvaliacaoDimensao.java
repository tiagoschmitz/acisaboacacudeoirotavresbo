package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.Dimensao;

import java.io.Serializable;
import java.util.Date;

public class RelatoAvaliacaoDimensao implements Serializable {
    private Date dataAvaliacao;
    private Dimensao dimensao;
    private Mantida mantida;
    private String relatoDimensao;


}
