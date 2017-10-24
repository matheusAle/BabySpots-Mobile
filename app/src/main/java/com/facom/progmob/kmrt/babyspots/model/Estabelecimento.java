package com.facom.progmob.kmrt.babyspots.model;

import java.util.HashMap;

/**
 * Created by matheus on 14/10/2017.
 */

class Estabelecimento {
    private String nome;
    private String endreco;
    private float nota;

    /**
     * Mapa de serviços. Esse mapa, mapeia os serviços com um mapa que contem valores associados a esse serviço.
     * Os valores padrões são:
     * - nota -> nota do serviço;
     * -
     */
    private HashMap<Servicos, HashMap<String, String>> servicos;




}
