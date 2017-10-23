package com.facom.progmob.kmrt.babyspots.model;

/**
 * Created by matheus on 14/10/2017.
 */

public class Estabelecimento {
    private String nome;
    private String endreco;
    
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
