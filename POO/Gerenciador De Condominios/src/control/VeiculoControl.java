/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Iterator;
import model.dao.CrudDao;
import model.domain.Veiculo;
import model.service.ServiceLocator;

/**
 *
 * @author Aline
 */
public class VeiculoControl {
    private final CrudDao dao;
    
    public VeiculoControl(){
    this.dao=ServiceLocator.getVeiculoDao();
    }
    
    public void salvarVeiculo(String placa,String modelo){
        Veiculo m = new Veiculo();
        m.setPlaca(placa);
        m.setModelo(modelo);
        dao.salvar(m);
    }
    
    public void excluirVeiculo(String placa,String modelo){
        Veiculo m= new Veiculo();
        m.setPlaca(placa);
        m.setModelo(modelo);
        dao.excluir(m);
    }
    
    public Iterator pesquisarVeiculo(String placa,String modelo){
        Veiculo m= new Veiculo();
        m.setPlaca(placa);
        m.setModelo(modelo);
        return dao.pesquisar(m).iterator();
    }
}
