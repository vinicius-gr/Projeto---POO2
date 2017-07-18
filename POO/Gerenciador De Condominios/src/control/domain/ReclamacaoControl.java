/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain;

import java.util.Iterator;
import model.dao.CrudDao;
import model.domain.Reclamacao;
import model.service.ServiceLocator;

/**
 *
 * @author Aline
 */
public class ReclamacaoControl {
    private final CrudDao dao;
    private static ReclamacaoControl reclamacaoControl;
    
    public ReclamacaoControl(){
    this.dao=ServiceLocator.getReclamacaoDao();
    }
    
     public static ReclamacaoControl getReclamacaoControl(){
        if(reclamacaoControl==null){
            reclamacaoControl= new ReclamacaoControl();
        }
        return reclamacaoControl;
    }
    
    public void salvarReclamacao(String assunto,String texto, String respostaSindico){
        Reclamacao m= new Reclamacao();
        m.setAssunto(assunto);
        m.setTexto(texto);
        m.setRespostaSindico(respostaSindico);
        dao.salvar(m);
    }
    
    public void excluirReclamacao(int codigo, String assunto,String texto, String respostaSindico){
        Reclamacao m= new Reclamacao();
        m.setCodigo(codigo);
        m.setAssunto(assunto);
        m.setTexto(texto);
        m.setRespostaSindico(respostaSindico);
        dao.excluir(m);
    }
    
    public Iterator pesquisarReclamacao(int codigo, String assunto,String texto, String respostaSindico){
        Reclamacao m= new Reclamacao();
        m.setCodigo(codigo);
        m.setAssunto(assunto);
        m.setTexto(texto);
        m.setRespostaSindico(respostaSindico);
        return dao.pesquisar(m).iterator();
    }
}
