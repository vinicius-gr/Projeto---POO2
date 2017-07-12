/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Iterator;
import model.dao.CrudDao;
import model.domain.AreaComum;
import model.service.ServiceLocator;

/**
 *
 * @author aline.lima
 */
public class AreaComumControl {

    private final CrudDao dao;
    
    public AreaComumControl(){
    this.dao=ServiceLocator.getAreaComumDao();
    }
    
    public void salvarAreaComum(String nome,double valor,String endereco){
        AreaComum m= new AreaComum();
        m.setNome(nome);
        m.setValor(valor);
        m.setEndereco(endereco);
        dao.salvar(m);
    }
    
    public void excluirAreaComum(String nome,double valor,String endereco){
        AreaComum m= new AreaComum();
        m.setNome(nome);
        m.setValor(valor);
        m.setEndereco(endereco);
        dao.excluir(m);
    }
    
    public Iterator pesquisarAreaComum(String nome,double valor,String endereco){
        AreaComum m= new AreaComum();
        m.setNome(nome);
        m.setValor(valor);
        m.setEndereco(endereco);
        return dao.pesquisar(m).iterator();
    }
}
