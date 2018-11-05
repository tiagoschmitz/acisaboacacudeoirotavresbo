package com.udesc.ceavi.emds.observatorioeducacaobasica.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "mantenedora")
public class Mantenedora implements Serializable {
    @Id
    @Column(length = 14)
    private String cnpjMantenedora;
    @Column(length = 75)
    private String razaoSocialMantenedora;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mantenedora")
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
