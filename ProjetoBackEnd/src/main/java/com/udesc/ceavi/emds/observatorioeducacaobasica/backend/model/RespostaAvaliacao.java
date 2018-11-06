package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "respostasAvaliacoes")
public class RespostaAvaliacao implements Serializable {
    @Id
    private Date dataAvaliacao;

    private Criterio criterio;
    private Indicador indicador;
    private Dimensao dimensao;
    private FormularioAvaliacao formularioAvaliacao;
    private Mantida mantida;
    private boolean respostaCriterio;
}
