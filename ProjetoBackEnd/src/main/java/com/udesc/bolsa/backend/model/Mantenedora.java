package com.udesc.bolsa.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mantenedora {
    @Id
    @Column(length = 14)
    private String cnpjMantenedora;
    @Column(length = 75)
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

    @Override
    public String toString() {
        return "Mantenedora{" +
                "cnpjMantenedora='" + cnpjMantenedora + '\'' +
                ", razaoSocialMantenedora='" + razaoSocialMantenedora + '\'' +
                '}';
    }
}
