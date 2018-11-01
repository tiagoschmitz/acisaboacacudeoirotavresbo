package com.udesc.bolsa.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mantida {
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


    public Mantida() {
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
    }

    public String getCnpjMantida() {
        return cnpjMantida;
    }

    public void setCnpjMantida(String cnpjMantida) {
        this.cnpjMantida = cnpjMantida;
    }

    public String getRazaoSocialMantida() {
        return razaoSocialMantida;
    }

    public void setRazaoSocialMantida(String razaoSocialMantida) {
        this.razaoSocialMantida = razaoSocialMantida;
    }

    public String getNomeFantasiaMantida() {
        return nomeFantasiaMantida;
    }

    public void setNomeFantasiaMantida(String nomeFantasiaMantida) {
        this.nomeFantasiaMantida = nomeFantasiaMantida;
    }

    public String getEnderecoMantida() {
        return enderecoMantida;
    }

    public void setEnderecoMantida(String enderecoMantida) {
        this.enderecoMantida = enderecoMantida;
    }

    public int getNroMantida() {
        return nroMantida;
    }

    public void setNroMantida(int nroMantida) {
        this.nroMantida = nroMantida;
    }

    public String getCepMantida() {
        return cepMantida;
    }

    public void setCepMantida(String cepMantida) {
        this.cepMantida = cepMantida;
    }

    public int getMunicipioMantida() {
        return municipioMantida;
    }

    public void setMunicipioMantida(int municipioMantida) {
        this.municipioMantida = municipioMantida;
    }

    public String getSiteMantida() {
        return siteMantida;
    }

    public void setSiteMantida(String siteMantida) {
        this.siteMantida = siteMantida;
    }

    public String getEmailMantida() {
        return emailMantida;
    }

    public void setEmailMantida(String emailMantida) {
        this.emailMantida = emailMantida;
    }

    public String getTelefoneFixoMantida() {
        return telefoneFixoMantida;
    }

    public void setTelefoneFixoMantida(String telefoneFixoMantida) {
        this.telefoneFixoMantida = telefoneFixoMantida;
    }

    public String getTelefoneCelularMantida() {
        return telefoneCelularMantida;
    }

    public void setTelefoneCelularMantida(String telefoneCelularMantida) {
        this.telefoneCelularMantida = telefoneCelularMantida;
    }

    public String getResponsavelDados() {
        return responsavelDados;
    }

    public void setResponsavelDados(String responsavelDados) {
        this.responsavelDados = responsavelDados;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getSecretarioMantida() {
        return secretarioMantida;
    }

    public void setSecretarioMantida(String secretarioMantida) {
        this.secretarioMantida = secretarioMantida;
    }

    public String getTelefoneSecretarioMantida() {
        return telefoneSecretarioMantida;
    }

    public void setTelefoneSecretarioMantida(String telefoneSecretarioMantida) {
        this.telefoneSecretarioMantida = telefoneSecretarioMantida;
    }

    public String getDiretorMantida() {
        return diretorMantida;
    }

    public void setDiretorMantida(String diretorMantida) {
        this.diretorMantida = diretorMantida;
    }

    public String getTelefoneDiretorMantida() {
        return telefoneDiretorMantida;
    }

    public void setTelefoneDiretorMantida(String telefoneDiretorMantida) {
        this.telefoneDiretorMantida = telefoneDiretorMantida;
    }

    public String getDependenciaAdministrativa() {
        return dependenciaAdministrativa;
    }

    public void setDependenciaAdministrativa(String dependenciaAdministrativa) {
        this.dependenciaAdministrativa = dependenciaAdministrativa;
    }

    public int getCorpoAdministrativo() {
        return corpoAdministrativo;
    }

    public void setCorpoAdministrativo(int corpoAdministrativo) {
        this.corpoAdministrativo = corpoAdministrativo;
    }

    public int getCorpoDocente() {
        return corpoDocente;
    }

    public void setCorpoDocente(int corpoDocente) {
        this.corpoDocente = corpoDocente;
    }

    public int getCorpoOutros() {
        return corpoOutros;
    }

    public void setCorpoOutros(int corpoOutros) {
        this.corpoOutros = corpoOutros;
    }

    public boolean isParticipouEducacenso() {
        return participouEducacenso;
    }

    public void setParticipouEducacenso(boolean participouEducacenso) {
        this.participouEducacenso = participouEducacenso;
    }

    public Mantenedora getMantenedora() {
        return mantenedora;
    }

    public void setMantenedora(Mantenedora mantenedora) {
        this.mantenedora = mantenedora;
    }

    @Override
    public String toString() {
        return "Mantida{" +
                "cnpjMantida='" + cnpjMantida + '\'' +
                ", razaoSocialMantida='" + razaoSocialMantida + '\'' +
                ", nomeFantasiaMantida='" + nomeFantasiaMantida + '\'' +
                ", enderecoMantida='" + enderecoMantida + '\'' +
                ", nroMantida=" + nroMantida +
                ", cepMantida='" + cepMantida + '\'' +
                ", municipioMantida=" + municipioMantida +
                ", siteMantida='" + siteMantida + '\'' +
                ", emailMantida='" + emailMantida + '\'' +
                ", telefoneFixoMantida='" + telefoneFixoMantida + '\'' +
                ", telefoneCelularMantida='" + telefoneCelularMantida + '\'' +
                ", responsavelDados='" + responsavelDados + '\'' +
                ", telefoneResponsavel='" + telefoneResponsavel + '\'' +
                ", secretarioMantida='" + secretarioMantida + '\'' +
                ", telefoneSecretarioMantida='" + telefoneSecretarioMantida + '\'' +
                ", diretorMantida='" + diretorMantida + '\'' +
                ", telefoneDiretorMantida='" + telefoneDiretorMantida + '\'' +
                ", dependenciaAdministrativa='" + dependenciaAdministrativa + '\'' +
                ", corpoAdministrativo=" + corpoAdministrativo +
                ", corpoDocente=" + corpoDocente +
                ", corpoOutros=" + corpoOutros +
                ", participouEducacenso=" + participouEducacenso +
                ", mantenedora=" + mantenedora +
                '}';
    }
}
