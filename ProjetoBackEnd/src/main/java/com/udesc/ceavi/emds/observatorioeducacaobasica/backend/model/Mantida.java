package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mantidas")
public class Mantida implements Serializable {
    @Id
    @Column(length = 14)
    private String cnpjMantida;
    @Column(length = 75)
    private String razaoSocialMantida;
    @Column(length = 75)
    private String nomeFantasiaMantida;
    @Column(length = 75)
    private String enderecoMantida;
    private int nroMantida;
    @Column(length = 8)
    private String cepMantida;
    private int municipioMantida;//CODIGO IBGE
    @Column(length = 75)
    private String siteMantida;
    @Column(length = 75)
    private String emailMantida;
    @Column(length = 11)
    private String telefoneFixoMantida;
    @Column(length = 11)
    private String telefoneCelularMantida;
    @Column(length = 75)
    private String responsavelDados;
    @Column(length = 11)
    private String telefoneResponsavel;
    @Column(length = 11)
    private String secretarioMantida;
    @Column(length = 11)
    private String telefoneSecretarioMantida;
    @Column(length = 75)
    private String diretorMantida;
    @Column(length = 11)
    private String telefoneDiretorMantida;
    @Column(length = 7)
    private String dependenciaAdministrativa;
    private int corpoAdministrativo;
    private int corpoDocente;
    private int corpoOutros;
    private boolean participouEducacenso;

    @ManyToOne
    @JoinColumn(name = "cnpj_mantenedora")
    private Mantenedora mantenedora;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mantida")
    private List<Ato> atos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mantida")
    private List<DadoEducacional> dadosEducacionais;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mantida")
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
