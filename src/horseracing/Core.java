/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horseracing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author lammer
 */
public class Core {
    
    public Integer calculaGanhador(List<Tickets> list){
        
        try {
            
            int cavalo_um = 0;
            int cavalo_dois = 0;
            int cavalo_tres = 0;
            int cavalo_quatro = 0;
            int cavalo_sinco = 0;
            int cavalo_seis = 0;
            int cavalo_sete = 0;
            int cavalo_oito = 0;
            int cavalo_nove = 0;
            int cavalo_dez = 0;
            
            /**
             * @see: Primeira regra verifica no banco quantas vitorias tem cada cavalo,
             * Pega o que tem menos ou os que tem e randomiza tirando o da aposta feita.
             */
            List<horseracing.Banco> merged = verificaBanco();

            if(merged.size() <= 0) //caso não tenha nada no banco ainda
            {
                for (int i = 0; i < list.size(); i++) {
                    cavalo_um = cavalo_um + list.get(i).getPtCvUm();
                    cavalo_dois = cavalo_dois + list.get(i).getPtCvDois();
                    cavalo_tres = cavalo_tres + list.get(i).getPtCvTres();
                    cavalo_quatro = cavalo_quatro + list.get(i).getPtCvQuatro();
                    cavalo_sinco = cavalo_sinco + list.get(i).getPtCvSinco();
                    cavalo_seis = cavalo_seis + list.get(i).getPtCvSeis();
                    cavalo_sete = cavalo_sete + list.get(i).getPtCvSete();
                    cavalo_oito = cavalo_oito + list.get(i).getPtCvOito();
                    cavalo_nove = cavalo_nove + list.get(i).getPtCvNove();
                    cavalo_dez = cavalo_dez + list.get(i).getPtCvDez();
                }
                // verifica os possiveis de serem sorteados
                ArrayList winners = new ArrayList();
                if(cavalo_um <= 0){
                    winners.add("1");
                }
                if(cavalo_dois <= 0){
                    winners.add("2");
                }
                if(cavalo_tres <= 0){
                    winners.add("3");
                }
                if(cavalo_quatro <= 0){
                    winners.add("4");
                }
                if(cavalo_sinco <= 0){
                    winners.add("5");
                }
                if(cavalo_seis <= 0){
                    winners.add("6");
                }
                if(cavalo_sete <= 0){
                    winners.add("7");
                }
                if(cavalo_oito <= 0){
                    winners.add("8");
                }
                if(cavalo_nove <= 0){
                    winners.add("9");
                }
                if(cavalo_dez <= 0){
                    winners.add("10");
                }

                if(!winners.isEmpty()){
                    Collections.shuffle(winners);
                    System.out.println( winners.get(0) ); //ganhador
                    
                    return 1;
                }
                
            }else{
                for (int i = 0; i < merged.size(); i++) {
                    System.out.println( merged.get(i).getCvQuatro() );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return 1;
    }

    /**
     * @see: Verifica a quantidade de cada um no banco, retorna a lista com total de cada
     */
    public static List<horseracing.Banco> verificaBanco() {

        EntityManager entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("cavaloloko?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        Query query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Banco b");
        //List lotListBanco = (java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList()));
        List<horseracing.Banco> merged = (java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList()));
        return merged;
    }

    /**
     * @see: Verifica a ultima configuração de margem de lucro valida
     */
    public static Integer getCurrentConfig() {
        
        Integer ganho = 2;
        
        try {
            EntityManager entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("cavaloloko?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
            Query query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Configuracao c");
            List<horseracing.Configuracao> config = (java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList()));
            if( config.size() > 0)
            {
                return config.get(0).getMargem();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ganho;
    }
    /**
     *@see: Soma ao banco uma vitoria para o ganhador desta partida
     */
    public boolean atualizaBanco(Integer cav_win){
        try {
            Banco lotBanco = new Banco();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    /**
     *@see: Guarda o ganhador da rodada e o valor de premio unitário para cada
     */
    public boolean upValueWinbyCavUnit(ArrayList prineAposta){
        try {
            Apostas lotAposta = new Apostas();
            lotAposta.setCavWin(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    /**
     *@see: Calcula o valor de premio a cada cavalo
     */
    public ArrayList getPremioByCavalos(){
        try {
            ArrayList premios = new ArrayList();
            List<horseracing.Banco> lotBancoAposta = verificaBanco();
            Integer valor = 1;
            
            if(lotBancoAposta.size() <= 0){
                for (int i = 1; i < 11; i++) {
                    System.out.println(getCurrentConfig());
                    valor = i*getCurrentConfig();
                    premios.add(i-1, valor);
                }
            }else{
                for (int i = 0; i < lotBancoAposta.size(); i++) {                    
                    //calcula valor cabeça cavalo um
                    if( lotBancoAposta.get(i).getCvUm() <= getCurrentConfig()){
                        valor =  getCurrentConfig() / lotBancoAposta.get(i).getCvUm();
                        valor = valor*1;
                        premios.add(0, valor);
                    }
                    
                    //calcula valor cabeça cavalo dois
                    if( lotBancoAposta.get(i).getCvDois()<= getCurrentConfig()){
                        valor =  getCurrentConfig() / lotBancoAposta.get(i).getCvDois();
                        valor = valor*2;
                        premios.add(1, valor);
                    }
                    
                    //calcula valor cabeça cavalo tres
                    if( lotBancoAposta.get(i).getCvTres()<= getCurrentConfig()){
                        valor =  getCurrentConfig() / lotBancoAposta.get(i).getCvTres();
                        valor = valor*3;
                        premios.add(2, valor);
                    }
                    
                    //calcula valor cabeça cavalo quatro
                    if( lotBancoAposta.get(i).getCvQuatro()<= getCurrentConfig()){
                        valor =  getCurrentConfig() / lotBancoAposta.get(i).getCvQuatro();
                        valor = valor*4;
                        premios.add(3, valor);
                    }
                }
            }
            return premios;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
