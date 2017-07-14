/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author tarci
 * @param <E>
 * @param <I>
 */
public interface CrudDao <E extends Serializable, I> {

    void excluir(E classeModelo);
    List pesquisar(E classeModelo);
    void salvar(E classeModelo);
    
}
