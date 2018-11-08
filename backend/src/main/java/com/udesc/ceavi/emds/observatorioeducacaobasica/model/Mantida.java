package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.Ato;
import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.DadoEducacional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Mantida implements Serializable {
    private String cnpjMantida;
    private String razaoSocialMantida;
    private String nomeFantasiaMantida;
    private String enderecoMantida;
    private int nroMantida;
    private String cepMantida;
    private int municipioMantida;//CODIGO IBGE
    private String siteMantida;
    private String emailMantida;
    private String telefoneFixoMantida;
    private String telefoneCelularMantida;
    private String responsavelDados;
    private String telefoneResponsavel;
    private String secretarioMantida;
    private String telefoneSecretarioMantida;
    private String diretorMantida;
    private String telefoneDiretorMantida;
    private String dependenciaAdministrativa;
    private int corpoAdministrativo;
    private int corpoDocente;
    private int corpoOutros;
    private boolean participouEducacenso;

    private Mantenedora mantenedora;

    private List<Ato> atos;

    private List<DadoEducacional> dadosEducacionais;

    private List<DadoEducacional> infraestrutura;

    public Mantida() {
        this.atos = new ArrayList<>();
        this.dadosEducacionais = new ArrayList<>();
        this.infraestrutura = new ArrayList<>();
    }

    public Mantida(String cnpjMantida, String razaoSocialMantida, String nomeFantasiaMantida,
                   String enderecoMantida, int nroMantida, String cepMantida, int municipioMantida,
                   String siteMantida, String emailMantida, String telefoneFixoMantida,
                   String telefoneCelularMantida, String responsavelDados, String telefoneResponsavel,
                   String secretarioMantida, String telefoneSecretarioMantida, String diretorMantida,
                   String telefoneDiretorMantida, String dependenciaAdministrativa, int corpoAdministrativo,
                   int corpoDocente, int corpoOutros, boolean participouEducacenso, Mantenedora mantenedora) {
        this.cnpjMantida = cnpjMantida;
        this.razaoSocialMantida = razaoSocialMantida;
        this.nomeFantasiaMantida = nomeFantasiaMantida;
        this.enderecoMantida = enderecoMantida;
        this.nroMantida = nroMantida;
        this.cepMantida = cepMantida;
        this.municipioMantida = municipioMantida;
        this.siteMantida = siteMantida;
        this.emailMantida = emailMantida;
        this.telefoneFixoMantida = telefoneFixoMantida;
        this.telefoneCelularMantida = telefoneCelularMantida;
        this.responsavelDados = responsavelDados;
        this.telefoneResponsavel = telefoneResponsavel;
        this.secretarioMantida = secretarioMantida;
        this.telefoneSecretarioMantida = telefoneSecretarioMantida;
        this.diretorMantida = diretorMantida;
        this.telefoneDiretorMantida = telefoneDiretorMantida;
        this.dependenciaAdministrativa = dependenciaAdministrativa;
        this.corpoAdministrativo = corpoAdministrativo;
        this.corpoDocente = corpoDocente;
        this.corpoOutros = corpoOutros;
        this.participouEducacenso = participouEducacenso;
        this.mantenedora = mantenedora;
        this.atos = new ArrayList<>();
        this.dadosEducacionais = new ArrayList<>();
        this.infraestrutura = new ArrayList<>();

    }
}
