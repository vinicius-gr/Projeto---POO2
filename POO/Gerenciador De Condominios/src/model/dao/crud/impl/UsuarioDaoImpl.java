/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.crud.impl;

import java.util.HashMap;
import java.util.Map;
import model.dao.CrudDaoImpl;
import model.dao.crud.UsuarioDao;
import model.domain.pessoas.Usuario;

/**
 *
 * @author Tarcisio
 */
public class UsuarioDaoImpl  extends CrudDaoImpl<Usuario,String> implements UsuarioDao {

    @Override
    protected String getChave(Usuario modelo) {
        return modelo.getCpf();
    }

    @Override
    protected String getConsultaSql(Usuario modelo) {
        
        StringBuffer sql = new StringBuffer("from Usuario where "
               + "1=1");
        if(modelo.getCpf()!=null && !modelo.getCpf().equals("")){
            sql.append("and cpf like :cpf " );
        }
        if(modelo.getNome()!=null && !modelo.getNome().equals("")){
            sql.append("and nome like :nome ");
        }
        if(modelo.getPermissao()!=null && !modelo.getPermissao().equals("")){
            sql.append(" and permissao like :permissao ");
        }
        if(modelo.getSenha()!=null && !modelo.getSenha().equals("")){
            sql.append(" and senha like :senha ");
        }
        return sql.toString();

    }

    @Override
    protected Map<String, Object> getParametrosMapa(Usuario modelo) {
        
        Map<String,Object> mapa =  new HashMap<>();
        
        if(modelo.getCpf()!=null && !modelo.getCpf().equals("")){
              mapa.put("cpf", modelo.getCpf());
        }
        if(modelo.getNome()!=null && !modelo.getNome().equals("")){
            mapa.put("nome", modelo.getNome());
        }
        if(modelo.getPermissao()!=null && !modelo.getPermissao().equals("")){
            mapa.put("permissao", modelo.getPermissao());
        }
        if(modelo.getSenha()!=null && !modelo.getSenha().equals("")){
            mapa.put("senha", modelo.getSenha());
        }
        
        return mapa;
    }

}