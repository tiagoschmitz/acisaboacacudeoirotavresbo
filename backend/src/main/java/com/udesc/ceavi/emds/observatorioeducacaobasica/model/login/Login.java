package com.udesc.ceavi.emds.observatorioeducacaobasica.model.login;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import javax.validation.constraints.NotEmpty;

public class Login {
    private ObjectId _id;
    private String cnpj;
    private String senha;
    private boolean isAdmin;

    public Login() {
    }

    public Login(String cnpj, String senha, boolean isAdmin) {
        this.cnpj = cnpj;
        this.senha = senha;
        this.isAdmin = isAdmin;
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

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "Login{" +
                "_id=" + _id +
                ", cnpj='" + cnpj + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}

