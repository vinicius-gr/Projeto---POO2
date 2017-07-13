/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.crud.impl;

import java.util.HashMap;
import java.util.Map;
import model.dao.CrudDaoImpl;
import model.dao.crud.VisitanteDao;
import model.domain.pessoas.Visitante;

/**
 *
 * @author Tarcisio
 */
public class VisitanteDaoImpl extends CrudDaoImpl<Visitante,String> implements VisitanteDao {
    
   

    @Override
    protected String getChave(Visitante modelo) {
            return modelo.getCpf();
    }

    @Override
    protected String getConsultaSql(Visitante modelo) {
        
        StringBuffer sql = new StringBuffer("from Visitante where "
               + "1=1");
        if(modelo.getCpf()!=null && !modelo.getCpf().equals("")){
            sql.append("and cpf like :cpf " );
        }
        if(modelo.getNome()!=null && !modelo.getNome().equals("")){
            sql.append("and nome like :nome ");
        }
        if(modelo.getHoraDeEntrada()!=null){
            sql.append(" and horaDeEntrada = :horaDeEntrada ");
        }
        if(modelo.getHoraDeSaida()!=null){
            sql.append(" and horaDeSaida = :horaDeSaida ");
        }
        if(modelo.getTelefone()!=null && !modelo.getTelefone().equals("")){
            sql.append(" and telefone like :telefone ");
        } 
        if(modelo.isPrestadorDeServico() != false){
            sql.append(" and prestadorDeServico = :prestadorDeServico ");
        } 
        return sql.toString();
    }

    @Override
    protected Map<String, Object> getParametrosMapa(Visitante modelo) {

         Map<String,Object> mapa =  new HashMap<>();
        
        if(modelo.getCpf()!=null && !modelo.getCpf().equals("")){
            mapa.put("cpf", modelo.getCpf());
        }
        if(modelo.getNome()!=null && !modelo.getNome().equals("")){
           mapa.put("nome", modelo.getNome());
        }
        if(modelo.getHoraDeEntrada()!=null){
            mapa.put("horaDeEntrada", modelo.getHoraDeEntrada());
        }
        if(modelo.getHoraDeSaida()!=null){
             mapa.put("horaDeSaida", modelo.getHoraDeSaida());
        }
        if(modelo.getTelefone()!=null && !modelo.getTelefone().equals("")){
            mapa.put("telefone", modelo.getTelefone());        
        }   
        if(modelo.isPrestadorDeServico() != false){
            mapa.put("prestadorDeServico", modelo.isPrestadorDeServico());        
        }

        return mapa;
    }

}
