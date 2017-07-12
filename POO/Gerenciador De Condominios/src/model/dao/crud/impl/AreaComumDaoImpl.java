/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.crud.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import model.dao.CrudDaoImpl;
import model.dao.crud.AreaComumDao;
import model.domain.AreaComum;

/**
 *
 * @author Tarcisio
 */
public class AreaComumDaoImpl extends CrudDaoImpl<AreaComum,String> implements AreaComumDao {
    
   

    @Override
    protected String getChave(AreaComum modelo) {
            return modelo.getNome();
    }

    @Override
    protected String getConsultaSql(AreaComum modelo) {
        StringBuffer sql = new StringBuffer("from AreaComum where "
               + "1=1");
        if(modelo.getValor()<0){
            sql.append(" and valor like :valor " );
        }
        if(modelo.getNome()!=null && !modelo.getNome().equals("")){
            sql.append("and nome like :nome ");
        }
        if(modelo.getEndereco()!=null && !modelo.getEndereco().equals("")){
            sql.append("and endereco like :endereco");
        }
        return sql.toString();
    }

    @Override
    protected Map<String, Object> getParametrosMapa(AreaComum modelo) {
           Map<String,Object> mapa =  new HashMap<>();
        
        if(modelo.getValor()<0){
            mapa.put("valor", modelo.getValor());
        }
        if(modelo.getNome()!=null && !modelo.getNome().equals("")){
             mapa.put("nome", modelo.getNome());
        }
        if(modelo.getEndereco()!=null && !modelo.getEndereco().equals("")){
             mapa.put("endereco", modelo.getEndereco());
        }
           
           
           return mapa;
    }
}
