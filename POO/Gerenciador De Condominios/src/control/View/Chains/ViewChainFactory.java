/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.View.Chains;

import control.View.ViewChain;

/**
 *
 * @author Tarcísio M. Almeida
 */
public abstract class ViewChainFactory {
    
    public static ViewChain getViewChainMenuPrincipal(String permissao){
         return ViewMenuPrincipal.getViewMenuPrincipal(permissao);
    }  
    public static ViewChain getViewChainMenu(String permissao){
        return ViewMenu.getViewMenu(permissao);
    }
    public static ViewChain getViewChainPainelPrincipal(String permissao){
        return ViewPainelPrincipal.getViewMenu(permissao);
    }
}
