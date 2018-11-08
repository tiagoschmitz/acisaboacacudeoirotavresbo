package com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao;

import java.util.List;

public class Comissao {

    private List<Membro> membros;
    private Ato ato;

    public Comissao() {
    }

    public Comissao(List<Membro> membros, Ato ato) {
        this.membros = membros;
        this.ato = ato;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public void setMembros(List<Membro> membros) {
        this.membros = membros;
    }

    public Ato getAto() {
        return ato;
    }

    public void setAto(Ato ato) {
        this.ato = ato;
    }
}
