/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author aline.lima
 */
public class Conexao {
    private static EntityManagerFactory emf;
    
    private static Conexao conexao;
    
    /*Padrão Singleton */
    private Conexao(){
        emf= Persistence.createEntityManagerFactory("GerenciadorDeCondominiosPU");
    }
    
    public synchronized static EntityManager getConexao(){
        if(Conexao.conexao==null){
            conexao= new Conexao();
        }
        return emf.createEntityManager();
    }

}
