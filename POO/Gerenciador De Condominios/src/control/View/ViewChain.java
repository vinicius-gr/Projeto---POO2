/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.View;

import javax.swing.JPanel;

/**
 *
 * @author Tarcísio M. Almeida
 */
public interface ViewChain{
    
    public JPanel getPainel(String tela);
    public void setNext(ViewChain proximo);
    public default void setPermissao(String permissao){
    
    }
}
