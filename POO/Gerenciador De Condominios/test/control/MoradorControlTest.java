/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.domain.MoradorControl;
import java.util.Iterator;
import model.domain.pessoas.Morador;

/**
 *
 * @author Tarcisio
 */
public class MoradorControlTest {
    
    public static void main(String[] args) {
        MoradorControl mc = MoradorControl.getMoradorControl();
        
        mc.salvarMorador("Andre Luiz", "000000000", "email", "numero", "endereco");
        
       
        
        Iterator it=  mc.pesquisarMorador("", "000000000", "", "", "");
        
        while(it.hasNext()){
            System.out.println(((Morador)it.next()).getNome());
        }
    }
}
