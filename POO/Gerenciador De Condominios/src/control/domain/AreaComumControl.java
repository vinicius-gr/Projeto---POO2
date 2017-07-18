/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain;

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
    private static AreaComumControl areaComumControl;
    
    private AreaComumControl(){
    this.dao=ServiceLocator.getAreaComumDao();
    }
    
    public static AreaComumControl getAreaComumControl(){
        if(areaComumControl==null){
            areaComumControl= new AreaComumControl();
        }
        return areaComumControl;
    
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
