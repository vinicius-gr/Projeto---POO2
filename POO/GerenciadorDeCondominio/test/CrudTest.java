
import model.dao.CrudDao;
import model.domain.Multa;
import model.domain.pessoas.Visitante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aline.lima
 */
public class CrudTest {
    
    public static void main(String[] args) {
        CrudDao<Multa> cd = new CrudDao<>();
        Multa m= new Multa();
        
        m.setDescricao("Teste");
        m.setValor(300);
        
        cd.save(m);
        
         CrudDao<Visitante> dc = new CrudDao<>();
         
         Visitante v = new Visitante();
         
         v.setNome("Teste");
         v.setCpf("teste-000");
         v.setTelefone("(xx)xxxxx-xxxx");
         
         
         dc.save(v);
        Visitante t;
         
                 t= dc.busca("teste-000");
                 
                 System.out.println("\n\n\n\n\n\nTeste: " + t.getNome());
         
         
         
    }
}
