/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Iterator;
import model.dao.CrudDao;
import model.domain.AreaComum;
import model.domain.Empresa;
import model.service.ServiceLocator;

/**
 *
 * @author Aline
 */
public class EmpresaControl {
    
    private final CrudDao dao;
    
    public EmpresaControl(){
    this.dao=ServiceLocator.getEmpresaDao();
    }
    
    public void salvarEmpresa(String cnpj, String nome, String telefone, String email, String servico){
        Empresa m= new Empresa();
        m.setCnpj(cnpj);
        m.setNome(nome);
        m.setTelefone(telefone);
        m.setEmail(email);
        m.setServico(servico);
        dao.salvar(m);
    }
    
    public void excluirEmpresa(String cnpj, String nome, String telefone, String email, String servico){
        Empresa m= new Empresa();
        m.setCnpj(cnpj);
        m.setNome(nome);
        m.setTelefone(telefone);
        m.setEmail(email);
        m.setServico(servico);
        dao.excluir(m);
    }
    
    public Iterator pesquisarEmpresa(String cnpj, String nome, String telefone, String email, String servico){
        Empresa m = new Empresa();
        m.setCnpj(cnpj);
        m.setNome(nome);
        m.setTelefone(telefone);
        m.setEmail(email);
        m.setServico(servico);
        return dao.pesquisar(m).iterator();
    }
}
