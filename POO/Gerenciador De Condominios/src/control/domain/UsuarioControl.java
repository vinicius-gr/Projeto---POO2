/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain;

import java.util.Iterator;
import java.util.List;
import model.dao.CrudDao;
import model.domain.pessoas.Usuario;
import model.service.ServiceLocator;

/**
 *
 * @author Aline
 */
public class UsuarioControl {
    private final CrudDao dao;
    private static UsuarioControl usuarioControl;
    
    public UsuarioControl(){
    this.dao=ServiceLocator.getUsuarioDao();
    }
    
    public static UsuarioControl getUsuarioControl(){
        if(usuarioControl==null){
            usuarioControl= new UsuarioControl();
        }
        return usuarioControl;
    }
    
    public void salvarUsuario(String cpf,String nome, String senha, String permissao){
        Usuario m= new Usuario();
        m.setCpf(cpf);
        m.setNome(nome);
        m.setSenha(senha);
        m.setPermissao(permissao);
        dao.salvar(m);
    }
    
    public void excluirUsuario(String cpf,String nome, String senha, String permissao){
        Usuario m= new Usuario();
        m.setCpf(cpf);
        m.setNome(nome);
        m.setSenha(senha);
        m.setPermissao(permissao);
        dao.excluir(m);
    }
    
    public Iterator pesquisarUsuario(String cpf,String nome, String senha, String permissao){
        Usuario m= new Usuario();
        m.setCpf(cpf);
        m.setNome(nome);
        m.setSenha(senha);
        m.setPermissao(permissao);
        return dao.pesquisar(m).iterator();
    }

    public Usuario login(String cpf,String senha){
            Usuario m= new Usuario();
        m.setCpf(cpf);
        m.setSenha(senha);
        
       List <Usuario> list = dao.pesquisar(m);
       
       if(list.size()==1){
       return  list.get(0);
       }
       else
           return null;
    
    }
}
