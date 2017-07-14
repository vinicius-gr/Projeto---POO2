/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.domain.VisitanteControl;
import java.util.Iterator;
import model.domain.pessoas.Visitante;

/**
 *
 * @author Tarcisio
 */
public class ControlTest {
    
    public static void main(String[] args) {
        VisitanteControl mc = new VisitanteControl();
        
        mc.salvarVisitante("nome","cpf", "telefone", false, new java.sql.Date(new java.util.Date().getTime()), new java.sql.Date(new java.util.Date().getTime()));
        
        Iterator it = mc.pesquisarVisitante("nome","cpf", "telefone", false, new java.sql.Date(new java.util.Date().getTime()), new java.sql.Date(new java.util.Date().getTime()));
        
        while(it.hasNext()){
            System.out.println(((Visitante)it.next()).getNome());
        }
    }
}

