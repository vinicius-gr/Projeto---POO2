/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.dao.CrudDao;
import model.domain.pessoas.Usuario;
import model.service.ServiceLocator;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class InclusaoTeste {
    
    public static void main(String[] args) {
        Usuario user = new Usuario();
        
        user.setCpf("12345");
        user.setNome("Aline de Souza Lima");
        user.setPermissao("Sindico");
        user.setSenha("12345");
        CrudDao usuarioDao = ServiceLocator.getUsuarioDao();
        
        usuarioDao.salvar(user);
        /*
        
        user.setCpf("12345678");
        user.setNome("Tarcisio Almeida");
        user.setPermissao("Morador");
        user.setSenha("12345678");
        usuarioDao.salvar(user);
        
                
        user.setCpf("123");
        user.setNome("Gonzaga");
        user.setPermissao("Porteiro");
        user.setSenha("123");
        usuarioDao.salvar(user);*/
        
    
    }
}
