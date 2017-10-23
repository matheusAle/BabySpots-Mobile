/**
 * Created by mathe on 14/10/2017.
 */
package com.facom.progmob.kmrt.babyspots.model;

import android.media.Image;


/**
 * Classe que modela um usuario da aplicação
 */
public class Usuario {
    private String nome;
    private String email;
    private Image fotoDePerfil;

    //TODO continuar a implementação!

    public Usuario(String nome, String email, Image fotoDePerfil) {
        this.nome = nome;
        this.email = email;
        this.fotoDePerfil = fotoDePerfil;
    }
}
