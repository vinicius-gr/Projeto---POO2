/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.View;

import javax.swing.JFrame;
import model.domain.pessoas.Usuario;
import view.LoginPanel;

/**
 *
 * @author Tarcísio M. Almeida
 */
public abstract class Tela {
    
        private static Usuario user;
       private static JFrame frame;
       private static ViewChain viewChain;
      private static  JFrame jf;
        
    public static void inicializaTela(Usuario user){
        
        frame= new JFrame("GerConT");
        Tela.user=user;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setResizable(false);
                
       viewChain = FactoryView.getChainView(user.getPermissao());
       frame.setContentPane(viewChain.getPainel(""));
       frame.setVisible(true);
    }
    
    public static void atualizaTela(String tela){
        
        frame.setContentPane(viewChain.getPainel(tela));
        frame.repaint();
        frame.validate();
    }
    
    public static void start(){
        
        frame = new JFrame("Login");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new LoginPanel());
        frame.setVisible(true);
    
    }
    
    public static void end(){
    frame.dispose();
    }

    public static Usuario getUser() {
        return user;
    }
}
