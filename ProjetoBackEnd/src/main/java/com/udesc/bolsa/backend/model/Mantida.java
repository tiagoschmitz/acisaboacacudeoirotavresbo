package com.udesc.bolsa.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
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
    private Mantenedora mantenedora;


}
