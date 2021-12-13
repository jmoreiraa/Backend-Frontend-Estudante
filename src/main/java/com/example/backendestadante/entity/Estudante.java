package com.example.backendestadante.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ESTUDANTE")
public class Estudante {
    
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;

    private String email;

    private int  cpf;

    private String endereco;

    private String periodo;

    public Estudante(){
        
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public String getEndereco() {
    return endereco;
}
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}
