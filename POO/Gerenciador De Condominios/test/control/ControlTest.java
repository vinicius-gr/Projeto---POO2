/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import model.domain.Empresa;
import model.domain.pessoas.Funcionario;

/**
 *
 * @author Tarcisio
 */
public class ControlTest {
    
    public static void main(String[] args) {
        FuncionarioControl mc= new FuncionarioControl();
        
        mc.salvarFuncionario("nome", "cpf" , "email", "telefone", "setorServico", new java.sql.Date(new java.util.Date().getTime()), new java.sql.Date(new java.util.Date().getTime()));
        
       /*String nome,String cpf, String email, String numero,String setorServico, Date horarioEntrada, Date horarioSaida*/
        
        Iterator it = mc.pesquisarFuncionario("nome", "cpf" , "email", "telefone", "setorServico", new java.sql.Date(new java.util.Date().getTime()), new java.sql.Date(new java.util.Date().getTime()));
        
        while(it.hasNext()){
            System.out.println(((Funcionario)it.next()).getNome());
        }
    }
}
