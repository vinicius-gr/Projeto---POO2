/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.dao.CrudDao;
import model.domain.Usuario;
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
        
        
    }
    
    
}
