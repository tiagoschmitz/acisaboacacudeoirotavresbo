package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class Instituicao {

    @Id
    @NotEmpty(message = "CNPJ não pode ser vazio")
//    @CNPJ(message = "CNPJ invalido")
    private String cnpjMantenedora;

    @NotEmpty(message = "Razão não pode ser vazio")
    private String razaoSocialMantenedora;

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


    private List<Ato> atos;

    private List<DadoEducacional> dadosEducacionais;

    private List<DadoEducacional> infraestrutura;
}
