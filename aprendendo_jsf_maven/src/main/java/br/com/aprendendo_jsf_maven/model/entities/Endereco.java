/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aprendendo_jsf_maven.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author Wellington
 */

@Entity
@Table (name = "Endereco")
public class Endereco implements Serializable{
    
    private static long serialVersionUID = 1L;
    
     public Endereco() {
         this.cidade = new Cidade();
         this.estado = new Estado();
         this.tipoLogradouro = new TipoLogradouro();
         this.tipoEndereco = new TipoEndereco();
         this.pessoa = new Pessoa();
    }
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "idEndereco")
    private Integer idEndereco;
    
    @Column (name = "bairro" , length = 80)
    private String bairro;
    
    @Column (name = "nomeLogradouro" , length = 100)
    private String nomeLogradouro;
    
    @Column (name = "cep" , length = 100)
    private String cep;
    
    @Column (name = "numero")
    private String numero;
    
    @Column (name = "complemento" , length = 100)
    private String complemento;

    @OneToOne (optional = true, fetch = FetchType.LAZY)
    @ForeignKey (name = "EnderecoPessoa")
    @JoinColumn (name = "idPessoa" , referencedColumnName = "idPessoa")
    private Pessoa pessoa;
    
    @ManyToOne (optional = false , fetch = FetchType.LAZY)
    @ForeignKey (name = "EnderecoTipoLogradouro")
    @JoinColumn (name = "idTipoLogradouro" , referencedColumnName = "idTipoLogradouro")
    private TipoLogradouro tipoLogradouro;
    
    
    @ManyToOne (optional = false , fetch = FetchType.LAZY)
    @ForeignKey (name = "EnderecoEstado")
    @JoinColumn (name = "idEstado" , referencedColumnName = "idEstado")
    private Estado estado;
    
    @ManyToOne (optional = false , fetch = FetchType.LAZY)
    @ForeignKey (name = "EnderecoTipoEndereco")
    @JoinColumn (name = "idTipoEndereco" , referencedColumnName = "idTipoEndereco")
    private TipoEndereco tipoEndereco;
    
    @ManyToOne (optional = false , fetch = FetchType.LAZY)
    @ForeignKey (name = "EnderecoCidade")
    @JoinColumn (name = "idCidade" , referencedColumnName = "idCidade")
    private Cidade cidade;
    
   

//GETTERS E SETTERS
    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
    
// FIM DOS GETTERS E SETTERS    
  

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Endereco other = (Endereco) obj;
        if (this.idEndereco != other.idEndereco && (this.idEndereco == null || !this.idEndereco.equals(other.idEndereco))) {
            return false;
        }
        return true;
    }

    

}
