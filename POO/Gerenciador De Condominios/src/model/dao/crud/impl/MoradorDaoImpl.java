/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.crud.impl;

import java.util.HashMap;
import java.util.Map;
import model.dao.CrudDaoImpl;
import model.dao.crud.MoradorDao;
import model.domain.pessoas.Morador;

/**
 *
 * @author  Tarcisio
 */
public class MoradorDaoImpl extends CrudDaoImpl<Morador,String> implements MoradorDao {
    
   

    @Override
    protected String getChave(Morador modelo) {
            return modelo.getCpf();
    }

    @Override
    protected String getConsultaSql(Morador modelo) {
       StringBuffer sql = new StringBuffer("from Morador where "
               + "1=1");
        if(modelo.getCpf()!=null && !modelo.getCpf().equals("")){
            sql.append("and cpf like :cpf " );
        }
        if(modelo.getNome()!=null && !modelo.getNome().equals("")){
            sql.append("and nome like :nome ");
        }
        if(modelo.getEndereco()!=null && !modelo.getEndereco().equals("")){
            sql.append(" and endereco like :endereco ");
        }
        if(modelo.getEmail()!=null && !modelo.getEmail().equals("")){
            sql.append(" and email like :email ");
        }
        if(modelo.getTelefone()!=null && !modelo.getTelefone().equals("")){
            sql.append(" and telefone like :telefone ");
        }    
        return sql.toString();
    }

    @Override
    protected Map<String, Object> getParametrosMapa(Morador morador) {
            
            Map<String,Object> mapa =  new HashMap<>();
         
         if(morador.getCpf()!=null && !morador.getCpf().equals("")){
            
            mapa.put("cpf", morador.getCpf());
        }
        if(morador.getNome()!=null && !morador.getNome().equals("")){
 
            mapa.put("nome", morador.getNome());
        }
        if(morador.getEndereco()!=null && !morador.getEndereco().equals("")){
            
             mapa.put("endereco", morador.getEndereco());
        }
        if(morador.getEmail()!=null && !morador.getEmail().equals("")){
            
            mapa.put("email",  morador.getEmail());
        }
        if(morador.getTelefone()!=null && !morador.getTelefone().equals("")){
           mapa.put("telefone",  morador.getTelefone());
        }       
        
        return mapa;
    }
    
    
    
}
