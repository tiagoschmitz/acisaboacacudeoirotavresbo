package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Mantenedora implements Serializable {
    private String cnpjMantenedora;
    private String razaoSocialMantenedora;

    private List<Mantida> mantidas;

    public Mantenedora(String cnpjMantenedora, String razaoSocialMantenedora) {
        this.cnpjMantenedora = cnpjMantenedora;
        this.razaoSocialMantenedora = razaoSocialMantenedora;
        this.mantidas = new ArrayList<Mantida>();
    }

    public Mantenedora() {
        this.mantidas = new ArrayList<Mantida>();
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

    public void addMantidas(Mantida mantida) {
        mantidas.add(mantida);
    }

    @Override
    public String toString() {
        return "Mantenedora{" +
                "cnpjMantenedora='" + cnpjMantenedora + '\'' +
                ", razaoSocialMantenedora='" + razaoSocialMantenedora + '\'' +
                '}';
    }
}
