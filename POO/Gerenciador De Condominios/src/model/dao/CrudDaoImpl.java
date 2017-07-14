/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author tarci
 * @param <E>
 * @param <I>
 */
public abstract class CrudDaoImpl <E extends Serializable, I> implements CrudDao <E,I>{

    @Override
    public void salvar(E classeModelo){
    
        EntityManager em = Conexao.getConexao();
        em.getTransaction().begin();
        
        if(this.getChave(classeModelo)!=null){
            classeModelo= em.merge(classeModelo);
        }
        em.persist(classeModelo);
        em.getTransaction().commit();
        em.close();
    
    }
    
    @Override
    public void excluir(E classeModelo){
    
        EntityManager em = Conexao.getConexao();
        em.getTransaction().begin();
        classeModelo= em.merge(classeModelo);
        em.remove(classeModelo);
        
        em.getTransaction().commit();
        em.close();
    
    }
    
    @Override
    public List pesquisar(E classeModelo){
        EntityManager em = Conexao.getConexao();
        
        String sql=this.getConsultaSql(classeModelo);
        
        Query q = em.createQuery(sql);
        
        Map<String,Object>parametros= getParametrosMapa(classeModelo);
        
        for(String parametro: parametros.keySet()){
        
            q.setParameter(parametro,parametros.get(parametro));
        }
        
       
        List l= q.getResultList();
        
       em.close();
       return l;
    }

    //Template Method
    protected abstract I getChave(E modelo);
    protected abstract String getConsultaSql(E modelo); 
    protected abstract Map<String, Object> getParametrosMapa(E classeModelo);
}
