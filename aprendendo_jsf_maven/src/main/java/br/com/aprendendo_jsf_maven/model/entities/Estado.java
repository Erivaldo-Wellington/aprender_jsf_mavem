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
public class Estado {
    
    @Id
    @GeneratedValue
    @Column (name = "idEstado")
    private Integer idEstado;
    
    
    @Column (name = "nomeEstado" , nullable = false, length = 15)
    private String nomeEstado;
}
