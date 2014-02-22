/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aprendendo_jsf_maven.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author Wellington
 */
@Entity
@Table (name = "Cidade")
public class Cidade implements Serializable{
    
    private static long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column (name = "idCidade")
    private Integer idCidade;
    
    @Column (name = "nome",  nullable = false, length = 40)
    private String nome;
    
    @OneToMany
    @ForeignKey (name = "CidadeEndereco")
    private List<Endereco> enderecos;

    public Cidade() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        Cidade.serialVersionUID = serialVersionUID;
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.idCidade != null ? this.idCidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        if (this.idCidade != other.idCidade && (this.idCidade == null || !this.idCidade.equals(other.idCidade))) {
            return false;
        }
        return true;
    }
    
    
    
    
}
