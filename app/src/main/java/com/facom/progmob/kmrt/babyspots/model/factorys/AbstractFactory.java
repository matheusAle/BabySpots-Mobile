package com.facom.progmob.kmrt.babyspots.model.factorys;

/**
 * Created by matheus on 24/10/2017.
 */
//TODO Kelvin: terminar a implementação. os docs são apenas sujestões!
abstract class AbstractFactory {


    /**
     * Execulta uma busca na base de dados.
     * @retun Retorna uma estrutura de dados contendo o resultado da busca.
     * @param query querry/restrução/parametros da busca.
     */
    protected void executarBusca(String query){

    }

    /**
     * execulta uma insersao/delete/update no base de dados
     * @param sql comano a ser execultado
     */
    protected void executarManipulacao(String sql) {

    }

}
