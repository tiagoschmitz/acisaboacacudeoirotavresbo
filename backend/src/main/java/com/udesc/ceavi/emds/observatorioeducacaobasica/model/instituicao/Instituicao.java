package com.udesc.ceavi.emds.observatorioeducacaobasica.model.instituicao;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.Ato;
import com.udesc.ceavi.emds.observatorioeducacaobasica.model.avaliacao.DadoEducacional;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class Instituicao {
    @Id
    private ObjectId objectId;

    @NotEmpty(message = "CNPJ não pode ser vazio")
    private String cnpjMantenedora;

    @NotEmpty(message = "Razão não pode ser vazio")
    private String razaoSocialMantenedora;
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
    private List<DadoEducacional> dadosEducacionais;
    private List<DadoEducacional> infraestrutura;
}
