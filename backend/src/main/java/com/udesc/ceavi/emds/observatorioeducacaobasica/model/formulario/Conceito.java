package com.udesc.ceavi.emds.observatorioeducacaobasica.model.formulario;

public class Conceito {

    private int valor;
    private String dica;
    private int minimo;
    private int maximo;


    public Conceito() {
    }

    public Conceito(int valor, String dica, int minimo, int maximo) {
        this.valor = valor;
        this.dica = dica;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    @Override
    public String toString() {
        return "Conceito{" +
                "valor=" + valor +
                ", dica='" + dica + '\'' +
                ", minimo=" + minimo +
                ", maximo=" + maximo +
                '}';
    }
}
