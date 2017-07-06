/*
 * To change this license header, choose License Hea  ders in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

/**
 *
 * @author aline.lima
 */
public class TesteMenu2  extends javax.swing.JPanel {
    
    public static void main(String[] args) {
        javax.swing.JFrame x = new javax.swing.JFrame();
        
        x.setSize(300,400);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.getContentPane().add(new TesteMenu("Porteiro"),BorderLayout.EAST);
        x.getContentPane().add(new TesteMenu("teste"),BorderLayout.WEST);
        x.setVisible(true);
        
    }
}
