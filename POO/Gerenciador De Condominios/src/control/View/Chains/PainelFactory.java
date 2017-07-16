/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.View.Chains;

import javax.swing.JPanel;
import view.paineis.*;

/**
 *
 * @author Tarcísio M. Almeida
 */
public abstract class PainelFactory {
    
     public static JPanel createPainel(String tela){
    
       switch (tela){
           
           case "BaixarFinanceiro": return new BaixarFinanceiroView();
           case "CadastroEncomenda": return new CadastroEncomendasView();
           case  "CadastroFuncionario":  return new CadastroFuncionarioView();
           
           case "CadastroMorador":  return new CadastroMoradorView();
           case "InformacoesPessoais":  return new InformacoesPessoaisView();
           case "ListarVisitantes": return new ListarVisitanteView();
           case "CadastroVisitante":  return new CadastroVisitanteView();
           case "ConsultarFinanceiro":  return new ConsultarFinanceiroView();
           case "ConsultarFuncionarios":  return new ConsultarFuncionariosView();
           case "ConsultarMoradores": return new ConsultarMoradoresView();
           case "ConsultarReserva": return new ConsultarReservaView();
           case  "IncluirFinanceiro":  return new IncluirFinanceiroView();
           case "ListarEncomendas":  return new ListarEncomendasView();
           case "RegistrarReclamacao":  return new RegistrarReclamacaoView();
           case "ReservarArea":  return new ReservarAreaView();
           case "ResponderReclamacao":  return new ResponderReclamacaoView();
           case "VisualizarReclamacao":  return new VisualizarReclamacaoView();
       }
       return new JPanel();
    }
    
}
