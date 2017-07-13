/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.crud.impl;

import java.util.HashMap;
import java.util.Map;
import model.dao.CrudDaoImpl;
import model.dao.crud.FuncionarioDao;
import model.domain.pessoas.Funcionario;

/**
 *
 * @author Tarcisio
 */
public class FuncionarioDaoImpl  extends CrudDaoImpl<Funcionario,String> implements FuncionarioDao {

    @Override
    protected String getChave(Funcionario modelo) {
        return modelo.getCpf();
    }

    @Override
    protected String getConsultaSql(Funcionario modelo) {
       StringBuffer sql = new StringBuffer("from Funcionario where "
               + "1=1");
        if(modelo.getCpf()!=null && !modelo.getCpf().equals("")){
            sql.append("and cpf like :cpf " );
        }
        if(modelo.getNome()!=null && !modelo.getNome().equals("")){
            sql.append("and nome like :nome ");
        }
        if(modelo.getSetorDeServico()!=null && !modelo.getSetorDeServico().equals("")){
            sql.append(" and setorDeServico like :setorDeServico ");
        }
        if(modelo.getEmail()!=null && !modelo.getEmail().equals("")){
            sql.append(" and email like :email ");
        }
        if(modelo.getTelefone()!=null && !modelo.getTelefone().equals("")){
            sql.append(" and telefone like :telefone ");
        }  
        if(modelo.getHorarioEntrada()!=null){
            sql.append(" and horarioEntrada = :horarioEntrada ");
        } 
        if(modelo.getHorarioSaida()!=null){
            sql.append(" and horarioSaida = :horarioSaida ");
        }  
        
        return sql.toString();    
    }

    @Override
    protected Map<String, Object> getParametrosMapa(Funcionario modelo) {
        
          Map<String,Object> mapa =  new HashMap<>();
        
        if(modelo.getCpf()!=null && !modelo.getCpf().equals("")){
            mapa.put("cpf", modelo.getCpf());
        }
        if(modelo.getNome()!=null && !modelo.getNome().equals("")){
              mapa.put("nome", modelo.getNome());
        }
        if(modelo.getSetorDeServico()!=null && !modelo.getSetorDeServico().equals("")){
              mapa.put("setorDeServico", modelo.getSetorDeServico());
        }
        if(modelo.getEmail()!=null && !modelo.getEmail().equals("")){
              mapa.put("email", modelo.getEmail());
        }
        if(modelo.getTelefone()!=null && !modelo.getTelefone().equals("")){
              mapa.put("telefone", modelo.getTelefone());
        }  
        if(modelo.getHorarioEntrada()!=null){
              mapa.put("horarioEntrada", modelo.getHorarioEntrada());
        }  
        if(modelo.getHorarioSaida()!=null){
              mapa.put("horarioSaida", modelo.getHorarioSaida());
        }  
        return mapa;
    }
    
   

}
