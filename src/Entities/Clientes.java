/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author jpaul
 */
public class Clientes {
    private String Nome;
    private String Celular;
    private String CPF;
    private String Endereco;
    
    public Clientes(String Nome, String Celular, String CPF, String Endereco){
    this.Nome = Nome;
    this.Celular = Celular;
    this.CPF = CPF;
    this.Endereco = Endereco;
    }
    
    public void setNome(String Nome){
    this.Nome = Nome;
    }
    
    public void setCelular(String Celular){
    this.Celular = Celular;
    }
    
    public void setCPF(String CPF){
    this.CPF = CPF;
    }
    
    public void setEndereco(String Endereco){
    this.Endereco = Endereco;
    }
    
    public String getNome(){
    return Nome;
    }
    
    public String getCelular(){
    return Celular;
    }
    
    public String getCPF(){
    return CPF;
    }
    
    public String getEndereco(){
    return Endereco;
    }
    
    
    public String toString(){
    return String.format("NOME: %S\nCPF: %S\nCELULAR: %S\nENDERECO: %S\n", Nome,CPF,Celular,Endereco);
    }
}
