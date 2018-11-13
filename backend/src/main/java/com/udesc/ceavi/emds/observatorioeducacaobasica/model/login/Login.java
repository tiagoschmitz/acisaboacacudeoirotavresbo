package com.udesc.ceavi.emds.observatorioeducacaobasica.model.login;

import org.bson.types.ObjectId;

public class Login {

    private ObjectId _id;
    private String cnpj;
    private String senha;

    public Login() {
    }

    public Login(String cnpj, String senha) {
        this.cnpj = cnpj;
        this.senha = senha;
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

    @Override
    public String toString() {
        return "Login{" +
                "_id=" + _id +
                ", cnpj='" + cnpj + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
