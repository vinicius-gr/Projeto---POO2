/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.View.Chains;

import control.View.ViewChain;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import view.MenuPrincipal;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class ViewMenuPrincipal implements ViewChain{

    private ViewChain proximo;
    private String permissao;
    private static ViewMenuPrincipal viewMenu;
    
    public ViewMenuPrincipal(String permissao){
        this.permissao=permissao;
    }   
    public static ViewMenuPrincipal getViewMenuPrincipal(String permissao){
        if(ViewMenuPrincipal.viewMenu==null){
           ViewMenuPrincipal.viewMenu= new ViewMenuPrincipal(permissao);
        }
        return ViewMenuPrincipal.viewMenu;
    }
    
    @Override
    public void setNext(ViewChain proximo) {
        this.proximo=proximo;
    }
    
    @Override
    public JPanel getPainel(String tela) {
             
    JPanel panel = new JPanel();
     panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
     panel.add(new MenuPrincipal(this.permissao));
     
     if(proximo!=null)
         panel.add(proximo.getPainel(tela));
     
     return panel; 
    }
        @Override
    public void setPermissao(String permissao) {
        this.permissao=permissao;
        if(proximo!=null){
            proximo.setPermissao(permissao);
        }
    }
}
