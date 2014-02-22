/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aprendendo_jsf_maven.model.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author Wellington
 */

@Entity
@Table (name = "Pessoa")
public class Pessoa implements Serializable{

    private static final long serialVersionUID = 1L;
    
    public Pessoa(){
        
    }
    
    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "idPessoa")
    private Integer idPessoa;
    
    @Column(name = "nome", nullable = false, length = 80)
    private String nome;
    
    @Column (name = "email")
    private String email;
    
    @Column (name = "telefone", length = 15)
    private String telefone;
    
    @Column (name = "cpf", nullable = false, length = 14)
    private String cpf;
    
    @Temporal (TemporalType.DATE)
    @Column (name = "dataDeNascimento")
    private Date dataDeNascimento;
    
    @Temporal (TemporalType.DATE)
    @Column (name = "dataDeCadastro")
    private Date dataDeCadastro;
    
    @OneToOne (mappedBy = "Pessoa" , fetch = FetchType.LAZY)
    @ForeignKey (name = "EnderecoPessoa")
    private Endereco endereco;
    
    
    @ManyToOne (optional = false)
    @ForeignKey (name = "PessoaSexo")
    @JoinColumn (name = "idSexo" , referencedColumnName = "idSexo")
    private Sexo sexo;
    
    //Getters e Setters
    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }
    
    

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    // Fim dos getters e setters
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.idPessoa != null ? this.idPessoa.hashCode() : 0);
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
        final Pessoa other = (Pessoa) obj;
        if (this.idPessoa != other.idPessoa && (this.idPessoa == null || !this.idPessoa.equals(other.idPessoa))) {
            return false;
        }
        return true;
    }
    
    
    
}
