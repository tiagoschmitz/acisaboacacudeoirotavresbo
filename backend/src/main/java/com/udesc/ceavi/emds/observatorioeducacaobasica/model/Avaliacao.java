package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Avaliacao {

    private int corpoAdministrativo;
    private int corpoDocente;
    private int corpoOutros;
    private boolean participouEducacenso;

    private Comissao comissao;

    private DadoEducacional dadoEducacional;
}
