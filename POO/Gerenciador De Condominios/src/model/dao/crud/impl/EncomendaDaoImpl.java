/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.crud.impl;

import java.util.HashMap;
import java.util.Map;
import model.dao.CrudDaoImpl;
import model.dao.crud.EncomendaDao;
import model.domain.Encomenda;

/**
 *
 * @author Tarcisio
 */
public class EncomendaDaoImpl extends CrudDaoImpl<Encomenda,String> implements EncomendaDao {
    
   

    @Override
    protected String getChave(Encomenda modelo) {
            return modelo.getCodigo();
    }

    @Override
    protected String getConsultaSql(Encomenda modelo) {
      
       StringBuffer sql = new StringBuffer("from Encomenda where "
               + "1=1");
        if(modelo.getDestinatario()!=null && !modelo.getDestinatario().equals("")){
            sql.append("and destinatario like :destinatario " );
        }
        if(modelo.getEndereco()!= null && !modelo.getEndereco().equals("")){
            sql.append("and endereco like :endereco ");
        }
        if(modelo.getCodigo() != null && modelo.getCodigo().equals("")){
            sql.append(" and codigo like :codigo ");
        }
        return sql.toString();    }

    @Override
    protected Map<String, Object> getParametrosMapa(Encomenda modelo) {
          Map<String,Object> mapa =  new HashMap<>();
          
        if(modelo.getDestinatario()!=null && !modelo.getDestinatario().equals("")){
            mapa.put("destinatario", modelo.getDestinatario());
        }
        if(modelo.getEndereco()!= null && !modelo.getEndereco().equals("")){
            mapa.put("endereco", modelo.getEndereco());
        }
        if(modelo.getCodigo() != null && modelo.getCodigo().equals("")){
            mapa.put("codigo", modelo.getCodigo());
        }  
        
        return mapa;
    }

}
