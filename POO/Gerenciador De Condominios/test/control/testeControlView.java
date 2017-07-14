/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.View.*;
import javax.swing.JFrame;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class testeControlView {
 
        public static void main(String[] args) {
            JFrame frame= new JFrame("Teste");
            
            frame.setSize(700,400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            ViewChain vc= FactoryView.getChainView("MoradorMestre");
            
            
            frame.setContentPane(vc.getPainel("Financeiro"));
            frame.setVisible(true);
            
            try{
                Thread.sleep(3000);
                frame.setContentPane(vc.getPainel("Moradores"));
                frame.repaint();
                frame.validate();
            }catch(Exception e){}
        }
}
