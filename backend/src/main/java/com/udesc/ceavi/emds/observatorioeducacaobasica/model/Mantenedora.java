package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Document
public class Mantenedora implements Serializable {
    @Id
    @NotEmpty(message = "CNPJ não pode ser vazio")
    @CNPJ(message = "CNPJ invalido")
    private String cnpjMantenedora;

    @NotEmpty(message = "Razão não pode ser vazio")
    private String razaoSocialMantenedora;

    public Mantenedora() {
    }

    public Mantenedora(String cnpjMantenedora, String razaoSocialMantenedora) {
        this.cnpjMantenedora = cnpjMantenedora;
        this.razaoSocialMantenedora = razaoSocialMantenedora;
    }

    public String getCnpjMantenedora() {
        return cnpjMantenedora;
    }

    public void setCnpjMantenedora(String cnpjMantenedora) {
        this.cnpjMantenedora = cnpjMantenedora;
    }

    public String getRazaoSocialMantenedora() {
        return razaoSocialMantenedora;
    }

    public void setRazaoSocialMantenedora(String razaoSocialMantenedora) {
        this.razaoSocialMantenedora = razaoSocialMantenedora;
    }
}
