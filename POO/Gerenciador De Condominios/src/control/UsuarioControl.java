/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Iterator;
import model.dao.CrudDao;
import model.domain.Usuario;
import model.service.ServiceLocator;

/**
 *
 * @author Aline
 */
public class UsuarioControl {
    private final CrudDao dao;
    
    public UsuarioControl(){
    this.dao=ServiceLocator.getUsuarioDao();
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
}
