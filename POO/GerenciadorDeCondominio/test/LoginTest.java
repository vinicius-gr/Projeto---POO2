
import View.LoginPanel;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aline.lima
 */
public class LoginTest {
    
    
    public static void main(String[] args) {
        
        LoginPanel  p = new LoginPanel();
        JFrame frame = new JFrame("Teste");
            frame.setContentPane(p);
            
            frame.setSize(400,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        
    }
}
