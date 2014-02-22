/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aprendendo_jsf_maven.model.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Wellington
 */
public class TipoEndereco {
    
    @Id
    @GeneratedValue
    @Column (name = "idTipoEndereco")
    private Integer idTipoEndereco;
    
    
    @Column (name = "descricao" , nullable = false, length = 50)
    private String descricao;
    
}
