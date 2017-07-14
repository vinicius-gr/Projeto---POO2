/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.View.Chains;

import javax.swing.JPanel;
import view.menus.*;

/**
 *
 * @author Tarcísio M. Almeida
 */
public abstract class MenuFactory {
    
    public static JPanel createMenu(String tela,String permissao){
    
              switch (tela){
           case "Financeiro":
           case "BaixarFinanceiro":
           case  "IncluirFinanceiro":
           case "ConsultarFinanceiro":  
               return new FinanceiroMenuView(permissao);
           case "Encomenda":
           case "CadastroEncomenda": 
           case "ListarEncomendas": 
               return new EncomendasMenuView(permissao);
            case "Funcionario":
           case  "CadastroFuncionario": 
           case "ConsultarFuncionarios": 
                 return new FuncionarioMenuView(permissao);
           case "Morador":      
           case "ConsultarMoradores":
           case "CadastroMorador":
                return new MoradoresMenuView(permissao);
          
            case "Visitante":
           case "CadastroVisitante": 
            return new EntradaSaidaMenuView(permissao);
           
           case "Area":
           case "ConsultarReserva": 
           case "ReservarArea": 
                  return new ReservaAreaMenuView(permissao);
            case "Reclamacao":       
           case "RegistrarReclamacao":  
           case "ResponderReclamacao": 
           case "VisualizarReclamacao":  
                return new ReclamacoesMenuView(permissao);
            case "InformacaoPessoal":
           case "InformacoesPessoais": 
                return new InformacoesPessoaisMenuView(permissao);
       } 

       return new JPanel();
    }
    
}
