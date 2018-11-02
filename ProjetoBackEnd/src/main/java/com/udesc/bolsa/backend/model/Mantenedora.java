package com.udesc.bolsa.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Mantenedora implements Serializable {
    @Id
    @Column(length = 14)
    private String cnpjMantenedora;
    @Column(length = 75)
    private String razaoSocialMantenedora;


}
