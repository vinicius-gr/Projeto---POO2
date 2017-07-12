/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import model.dao.crud.*;
import model.dao.crud.impl.*;

/**
 *
 * @author aline.lima
 */
public class ServiceLocator<E> {
    
    
    public static MoradorDao getMoradorDao(){
        return new MoradorDaoImpl();
    }
    public static AreaComumDao getAreaComumDao(){
        return new AreaComumDaoImpl();
    }
    public static EmpresaDao getEmpresaDao(){
        return new EmpresaDaoImpl();
    }
    public static EncomendaDao getEncomendaDao(){
        return new EncomendaDaoImpl();
    }
    public static FuncionarioDao getFuncionarioDao(){
        return new FuncionarioDaoImpl();
    }  
    public static ReclamacaoDao getReclamacaoDao(){
        return new ReclamacaoDaoImpl();
    }
    public static UsuarioDao getUsuarioDao(){
        return new UsuarioDaoImpl();
    }
    public static VeiculoDao getVeiculoDao(){
        return new VeiculoDaoImpl();
    }
    public static VisitanteDao getVisitanteDao(){
        return new VisitanteDaoImpl();
    }
   
}
