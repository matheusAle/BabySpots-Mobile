package com.facom.progmob.kmrt.babyspots.model;

import java.util.HashMap;

/**
 * Created by matheus on 14/10/2017.
 */

class Estabelecimento {
    private String nome;
    private String endereco;
    private float nota;

    /**
     * Mapa de serviços. Esse mapa, mapeia os serviços com um mapa que contem valores associados a esse serviço.
     * Os valores padrões são:
     * - nota -> nota do serviço;
     * -
     */
    private HashMap<Servicos, HashMap<String, String>> servicos;

    
    public Estabelecimento(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }    
}
