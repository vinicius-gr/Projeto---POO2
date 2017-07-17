/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.View;

import control.View.Chains.ViewChainFactory;


/**
 *
 * @author Tarcísio M. Almeida
 */
public abstract class FactoryView {
    
    
    private static ViewChain viewChain;
    
   public static ViewChain getChainView(String permissao){
       
       if(viewChain==null){
        ViewChain menuPrincipal = ViewChainFactory.getViewChainMenuPrincipal(permissao);
        ViewChain menu = ViewChainFactory.getViewChainMenu(permissao) ;
        ViewChain painelPrincipal = ViewChainFactory.getViewChainPainelPrincipal(permissao);
        
        menu.setNext(painelPrincipal);
        menuPrincipal.setNext(menu);
        FactoryView.viewChain=menuPrincipal;
       }
       else
        viewChain.setPermissao(permissao);
       
        return viewChain;
    }
}
