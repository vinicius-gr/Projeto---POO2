/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author aline.lima
 */
@Entity
@Table(name="area_comum")
public class AreaComum implements Serializable {
    @Id
    private String nome;
    private double valor;
    private String endereco;
}
