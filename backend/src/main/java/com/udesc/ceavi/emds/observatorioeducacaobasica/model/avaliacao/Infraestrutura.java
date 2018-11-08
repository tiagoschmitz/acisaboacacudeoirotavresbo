package com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao;

public class Infraestrutura {

    private String descricaoAmbiente;

    private int quantidade;

    private String descricaoOpcional;

    public Infraestrutura(){
    }

    public Infraestrutura(String descricaoAmbiente, int quantidade, String descricaoOpcional) {
        this.descricaoAmbiente = descricaoAmbiente;
        this.quantidade = quantidade;
        this.descricaoOpcional = descricaoOpcional;
    }

    public String getDescricaoAmbiente() {
        return descricaoAmbiente;
    }

    public void setDescricaoAmbiente(String descricaoAmbiente) {
        this.descricaoAmbiente = descricaoAmbiente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricaoOpcional() {
        return descricaoOpcional;
    }

    public void setDescricaoOpcional(String descricaoOpcional) {
        this.descricaoOpcional = descricaoOpcional;
    }

    @Override
    public String toString() {
        return "Infraestrutura{" +
                "descricaoAmbiente='" + descricaoAmbiente + '\'' +
                ", quantidade=" + quantidade +
                ", descricaoOpcional='" + descricaoOpcional + '\'' +
                '}';
    }
}
