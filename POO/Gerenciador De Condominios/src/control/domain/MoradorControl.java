package control.domain;

import java.util.Iterator;
import model.dao.CrudDao;
import model.domain.pessoas.Morador;
import model.service.ServiceLocator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aline.lima
 */
public class MoradorControl {

    private final CrudDao dao;
    
    public MoradorControl(){
    this.dao=ServiceLocator.getMoradorDao();
    }
    
    public void salvarMorador(String nome,String cpf, String email, String numero,String endereco){
        Morador m= new Morador();
        m.setCpf(cpf);
        m.setEmail(email);
        m.setTelefone(numero);
        m.setNome(nome);
        m.setEndereco(endereco);
        dao.salvar(m);
    }
    
    public void excluirMorador(String nome,String cpf, String email, String numero,String endereco){
        Morador m= new Morador();
        m.setCpf(cpf);
        m.setEmail(email);
        m.setTelefone(numero);
        m.setNome(nome);
        m.setEndereco(endereco);
        dao.excluir(m);
    }
    
    public Iterator pesquisarMorador(String nome,String cpf, String email, String numero,String endereco){
        Morador m= new Morador();
        m.setCpf(cpf);
        m.setEmail(email);
        m.setTelefone(numero);
        m.setNome(nome);
        m.setEndereco(endereco);
        return dao.pesquisar(m).iterator();
    }
}
