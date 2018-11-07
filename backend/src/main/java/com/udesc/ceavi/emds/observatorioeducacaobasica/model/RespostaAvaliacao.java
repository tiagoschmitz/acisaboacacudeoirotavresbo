package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import java.io.Serializable;
import java.util.Date;

public class RespostaAvaliacao implements Serializable {
    private Date dataAvaliacao;

    private Criterio criterio;
    private Indicador indicador;
    private Dimensao dimensao;
    private FormularioAvaliacao formularioAvaliacao;
    private Mantida mantida;
    private boolean respostaCriterio;
}
