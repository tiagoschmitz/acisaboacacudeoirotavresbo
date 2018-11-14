package com.udesc.ceavi.emds.observatorioeducacaobasica.model.login;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;

import javax.validation.constraints.NotEmpty;

public class Login {

    private ObjectId _id;

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    @NotEmpty
    private String cnpj;

    @NotEmpty
    private String senha;

    private boolean admin;

    public Login(ObjectId _id, @NotEmpty String cnpj, @NotEmpty String senha, boolean admin) {
        this._id = _id;
        this.cnpj = cnpj;
        this.senha = senha;
        this.admin = admin;
    }

    public Login() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}

