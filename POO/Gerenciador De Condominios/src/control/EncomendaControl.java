/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

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
    
    public EncomendaControl(){
    this.dao=ServiceLocator.getEncomendaDao();
    }
    
    public void salvarEncomenda(String endereco, String destinatario){
        Encomenda m= new Encomenda();
        m.setEndereco(endereco);
        m.setDestinatario(destinatario);
        dao.salvar(m);
    }
    
    public void excluirEncomenda(int codigo,String endereco, String destinatario){
        Encomenda m= new Encomenda();
        m.setCodigo(codigo);
        m.setEndereco(endereco);
        m.setDestinatario(destinatario);
        dao.excluir(m);
    }
    
    public Iterator pesquisarEncomenda(int codigo, String endereco, String destinatario){
        Encomenda m= new Encomenda();
        m.setCodigo(codigo);
        m.setEndereco(endereco);
        m.setDestinatario(destinatario);
        return dao.pesquisar(m).iterator();
    }
}
