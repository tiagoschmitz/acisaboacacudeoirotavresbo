package com.udesc.ceavi.emds.observatorioeducacaobasica.model.instituicao;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.Ato;
import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.DadoEducacional;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class Instituicao {
    @Id
    private ObjectId _id;

    @NotEmpty(message = "CNPJ não pode ser vazio")
    private String cnpjMantenedora;

    @NotEmpty(message = "Razão não pode ser vazio")
    private String razaoSocialMantenedora;
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String endereco;
    private int nro;
    private String cep;
    private int municipio;//CODIGO IBGE
    private String site;
    private String email;
    private String telefoneFixo;
    private String telefoneCelular;
    private String responsavelDados;
    private String telefoneResponsavel;
    private String secretario;
    private String telefoneSecretario;
    private String diretor;
    private String telefoneDiretor;
    private String dependenciaAdministrativa;
    private List<Ato> atos;

    public Instituicao(@NotEmpty(message = "CNPJ não pode ser vazio") String cnpjMantenedora, @NotEmpty(message = "Razão não pode ser vazio") String razaoSocialMantenedora, String cnpj, String razaoSocial, String nomeFantasia, String endereco, int nro, String cep, int municipio, String site, String email, String telefoneFixo, String telefoneCelular, String responsavelDados, String telefoneResponsavel, String secretario, String telefoneSecretario, String diretor, String telefoneDiretor, String dependenciaAdministrativa, List<Ato> atos) {
        this.cnpjMantenedora = cnpjMantenedora;
        this.razaoSocialMantenedora = razaoSocialMantenedora;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
        this.nro = nro;
        this.cep = cep;
        this.municipio = municipio;
        this.site = site;
        this.email = email;
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.responsavelDados = responsavelDados;
        this.telefoneResponsavel = telefoneResponsavel;
        this.secretario = secretario;
        this.telefoneSecretario = telefoneSecretario;
        this.diretor = diretor;
        this.telefoneDiretor = telefoneDiretor;
        this.dependenciaAdministrativa = dependenciaAdministrativa;
        this.atos = atos;
    }

    public Instituicao() {
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
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

    public String getSecretario() {
        return secretario;
    }

    public void setSecretario(String secretario) {
        this.secretario = secretario;
    }

    public String getTelefoneSecretario() {
        return telefoneSecretario;
    }

    public void setTelefoneSecretario(String telefoneSecretario) {
        this.telefoneSecretario = telefoneSecretario;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getTelefoneDiretor() {
        return telefoneDiretor;
    }

    public void setTelefoneDiretor(String telefoneDiretor) {
        this.telefoneDiretor = telefoneDiretor;
    }

    public String getDependenciaAdministrativa() {
        return dependenciaAdministrativa;
    }

    public void setDependenciaAdministrativa(String dependenciaAdministrativa) {
        this.dependenciaAdministrativa = dependenciaAdministrativa;
    }

    public List<Ato> getAtos() {
        return atos;
    }

    public void setAtos(List<Ato> atos) {
        this.atos = atos;
    }
}

