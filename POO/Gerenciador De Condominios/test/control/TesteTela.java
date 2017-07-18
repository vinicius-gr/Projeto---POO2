/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.View.Tela;
import model.domain.pessoas.Usuario;
/**
 *
 * @author Tarcísio M. Almeida
 */
public class TesteTela {
    
    public static void main(String[] args) {
        
        Usuario user= new Usuario();
        user.setPermissao("Sindico");
        Tela.inicializaTela(user);
        
        Tela.atualizaTela("ReservarArea");
        
    }
}
