/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.View.Chains;

import control.View.ViewChain;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class ViewMenu  implements ViewChain{

  
    private ViewChain proximo;
    private String permissao;
    private static ViewMenu viewMenu;
    
    private ViewMenu(String permissao){
        this.permissao=permissao;
    }
    
    public static ViewMenu getViewMenu(String permissao){
        if(ViewMenu.viewMenu==null){
           ViewMenu.viewMenu= new ViewMenu(permissao);
        }
        return ViewMenu.viewMenu;
    }
    
    @Override
    public void setNext(ViewChain proximo) {
        this.proximo=proximo;
    }

    @Override
    public JPanel getPainel(String tela) {
                 
    JPanel panel = new JPanel();
     panel.setLayout(new BorderLayout());
  
     panel.add(MenuFactory.createMenu(tela,this.permissao),BorderLayout.NORTH);
     if(proximo!=null)
         panel.add(proximo.getPainel(tela),BorderLayout.CENTER);
 
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
