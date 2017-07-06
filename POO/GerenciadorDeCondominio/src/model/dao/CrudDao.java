/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import javax.persistence.*;
import model.domain.pessoas.Visitante;

/**
 *@author aline.lima
 *
 */

public class CrudDao<E>{
    private EntityManagerFactory emf;
    private EntityManager em; //envia os comandos 
    private EntityTransaction tx; //faz os comits ou rollbacks da conexao
    
    private void iniciaConexao(){
        emf= Persistence.createEntityManagerFactory("GerenciadorDeCondominioPU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        tx.begin();
    }
    private void encerraConexao(){
        tx.commit();
        em.close();
        emf.close();
    
    }
    public void save(E obj){
        this.iniciaConexao();
        em.persist(obj);
        this.encerraConexao();
    }
    public void delete(E obj){
        this.iniciaConexao();
        em.remove(obj);
        this.encerraConexao();
    }
    
    public E busca(String chave){
        this.iniciaConexao();
        E e;
        e= em.find((Class<E>) Visitante.class, chave);
        this.encerraConexao();
        return e;
    
    }
}
