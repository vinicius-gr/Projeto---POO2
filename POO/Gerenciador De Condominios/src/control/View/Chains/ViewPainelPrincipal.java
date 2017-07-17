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
public class ViewPainelPrincipal implements ViewChain {

 
    private ViewChain proximo;
    private String permissao;
    private static ViewPainelPrincipal painel;
    
    private ViewPainelPrincipal(String permissao){
        this.permissao=permissao;
    }
    public static ViewPainelPrincipal getViewMenu(String permissao){
        if(ViewPainelPrincipal.painel==null){
           ViewPainelPrincipal.painel= new ViewPainelPrincipal(permissao);
        }
        return ViewPainelPrincipal.painel;
    }
    
    @Override
    public void setNext(ViewChain proximo) {
        this.proximo=proximo;
    }

    @Override
    public JPanel getPainel(String tela) {
                 
    JPanel panel = new JPanel();
     panel.setLayout(new BorderLayout());

     panel.add(PainelFactory.createPainel(tela));
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
