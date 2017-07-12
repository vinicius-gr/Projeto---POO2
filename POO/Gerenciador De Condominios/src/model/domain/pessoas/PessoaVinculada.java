/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.pessoas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author aline.lima
 */
@Entity
@Table(name="pessoavinculada")
@PrimaryKeyJoinColumn(name="cpf")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class PessoaVinculada extends Pessoa{
          @Column (name="email")
           private String email;
        
   //Gets and Sets
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
 
}