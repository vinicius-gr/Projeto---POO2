/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain;

import java.util.Iterator;
import model.dao.CrudDao;
import model.domain.Encomenda;
import model.service.ServiceLocator;

/**
 *
 * @author Aline
 */
public class EncomendaControl {
    
    private final CrudDao dao;
    private static EncomendaControl encomendaControl;
    
    private EncomendaControl(){
    this.dao=ServiceLocator.getEncomendaDao();
    }
    
    public static EncomendaControl getEncomendaControl(){
        if(encomendaControl==null){
            encomendaControl= new EncomendaControl();
        }
        return encomendaControl;
    }
    
    public void salvarEncomenda(String codigo, String endereco, String destinatario, boolean entregue){
        Encomenda m= new Encomenda();
        m.setCodigo(codigo);
        m.setEndereco(endereco);
        m.setDestinatario(destinatario);
        m.setEntregue(entregue);
        dao.salvar(m);
    }
    
    public void excluirEncomenda(String codigo,String endereco, String destinatario){
        Encomenda m= new Encomenda();
        m.setCodigo(codigo);
        m.setEndereco(endereco);
        m.setDestinatario(destinatario);
        dao.excluir(m);
    }
    
    public Iterator pesquisarEncomenda(String codigo, String endereco, String destinatario){
        Encomenda m= new Encomenda();
        m.setCodigo(codigo);
        m.setEndereco(endereco);
        m.setDestinatario(destinatario);
        return dao.pesquisar(m).iterator();
    }
}
