/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Iterator;
import model.dao.CrudDao;
import model.domain.pessoas.Morador;
import model.service.ServiceLocator;

/**
 *
 * @author Tarcisio
 */
public class TestCrudDao {
    
    public static void main(String[] args) {
        CrudDao cd= ServiceLocator.getMoradorDao();
        
        Morador m =new Morador();
        Morador m2 =new Morador();
        
        m.setNome("TesteNome");
        m.setCpf("TesteCPF");
        m.setEndereco("TesteEndereco");
        m.setTelefone("TesteTelefone");
          cd.salvar(m);
        
       m2.setCpf("TesteCPF");
        
        Iterator it=  cd.pesquisar(m2).iterator();
        
        while(it.hasNext()){
            System.out.println(((Morador)it.next()).getNome());
        }
    }
}
