/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author aline.lima
 */

@Entity
@Table(name="encomenda")
public class Encomenda implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;
    private int endereco;
    private int destinatario;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getEndereco() {
        return endereco;
    }
    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

}
