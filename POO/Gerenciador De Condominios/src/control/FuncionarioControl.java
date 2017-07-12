/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Date;
import java.util.Iterator;
import model.dao.CrudDao;
import model.domain.pessoas.Funcionario;
import model.service.ServiceLocator;

/**
 *
 * @author Aline
 */
public class FuncionarioControl {
    
    private final CrudDao dao;
    
    public FuncionarioControl(){
    this.dao=ServiceLocator.getFuncionarioDao();
    }
    
    public void salvarFuncionario(String nome,String cpf, String email, String numero,String setorServico, Date horarioEntrada, Date horarioSaida){
        Funcionario m= new Funcionario();
        m.setCpf(cpf);
        m.setEmail(email);
        m.setTelefone(numero);
        m.setNome(nome);
        m.setSetorDeServico(setorServico);
        m.setHorarioEntrada(horarioEntrada);
        m.setHorarioSaida(horarioSaida);
        dao.salvar(m);
    }
    
    public void excluirFuncionario(String nome,String cpf, String email, String numero,String setorServico, Date horarioEntrada, Date horarioSaida){
        Funcionario m= new Funcionario();
        m.setCpf(cpf);
        m.setEmail(email);
        m.setTelefone(numero);
        m.setNome(nome);
        m.setSetorDeServico(setorServico);
        m.setHorarioEntrada(horarioEntrada);
        m.setHorarioSaida(horarioSaida);
        dao.excluir(m);
    }
    
    public Iterator pesquisarFuncionario(String nome,String cpf, String email, String numero,String setorServico, Date horarioEntrada, Date horarioSaida){
        Funcionario m= new Funcionario();
        m.setCpf(cpf);
        m.setEmail(email);
        m.setTelefone(numero);
        m.setNome(nome);
        m.setSetorDeServico(setorServico);
        m.setHorarioEntrada(horarioEntrada);
        m.setHorarioSaida(horarioSaida);
        return dao.pesquisar(m).iterator();
    }
}
