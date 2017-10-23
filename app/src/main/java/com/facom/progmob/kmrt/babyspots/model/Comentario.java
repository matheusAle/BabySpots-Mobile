package com.facom.progmob.kmrt.babyspots.model;

/**
 * Created by mathe on 14/10/2017.
 */

import java.util.HashMap;

/**
 * Classe que modela um comentário de um estabelecimento
 */
public class Comentario {

    private String usuarioID;
    private String dataDoComentario;
    private HashMap<Servico, String> comentarios;

    
    public Comentario(String usuarioID, String dataDoComentario, HashMap<Servico, String> comentarios) {
        this.usuarioID = usuarioID;
        this.dataDoComentario = dataDoComentario;
        this.comentarios = comentarios;
    }
    
    public String getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(String usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getDataDoComentario() {
        return dataDoComentario;
    }

    public void setDataDoComentario(String dataDoComentario) {
        this.dataDoComentario = dataDoComentario;
    }
    //TODO terminar implementação!
}
