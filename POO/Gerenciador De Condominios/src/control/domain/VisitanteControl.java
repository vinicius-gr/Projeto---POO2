package control.domain;

import java.sql.Date;
import java.util.Iterator;
import model.dao.CrudDao;
import model.domain.pessoas.Visitante;
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
public class VisitanteControl {

    private final CrudDao dao;
    private static VisitanteControl visitanteControl;
    
    public VisitanteControl(){
    this.dao=ServiceLocator.getVisitanteDao();
    }
    
    public static VisitanteControl getVisitanteControl(){
        if(visitanteControl==null){
            visitanteControl= new VisitanteControl();
        }
        return visitanteControl;
    }
    
    public void salvarVisitante(String nome,String cpf, String telefone,boolean prestadorServico, Date horaDeEntrada, Date horaDeSaida){
        Visitante m= new Visitante();
        m.setNome(nome);
        m.setCpf(cpf);
        m.setTelefone(telefone);
        m.setPrestadorDeServico(prestadorServico);
        m.setHoraDeEntrada(horaDeEntrada);
        m.setHoraDeSaida(horaDeSaida);
        dao.salvar(m);
    }
    
    public void excluirVisitante(String nome,String cpf, String telefone,boolean prestadorServico, Date horaDeEntrada, Date horaDeSaida){
        Visitante m= new Visitante();
        m.setNome(nome);
        m.setCpf(cpf);
        m.setTelefone(telefone);
        m.setPrestadorDeServico(prestadorServico);
        m.setHoraDeEntrada(horaDeEntrada);
        m.setHoraDeSaida(horaDeSaida);
        dao.excluir(m);
    }
    
    public Iterator pesquisarVisitante(String nome,String cpf, String telefone,boolean prestadorServico, Date horaDeEntrada, Date horaDeSaida){
        Visitante m= new Visitante();
        m.setNome(nome);
        m.setCpf(cpf);
        m.setTelefone(telefone);
        m.setPrestadorDeServico(prestadorServico);
        m.setHoraDeEntrada(horaDeEntrada);
        m.setHoraDeSaida(horaDeSaida);
        return dao.pesquisar(m).iterator();
    }
}
