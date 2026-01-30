/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author jpaul
 */
public class Produtos {
    private int Codigo;
    private String Nome;
    private String Tipo;
    private Double Valor;
    private int Quantidade;
    
    public Produtos(int codigo, String nome, String tipo, Double valor,int Quantidade) {
        this.Codigo = codigo;
        this.Nome = nome;
        this.Tipo = tipo;
        this.Valor = valor;
        this.Quantidade = Quantidade;
    }

    // Getter e Setter de Codigo
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    // Getter e Setter de Nome
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    // Getter e Setter de Tipo
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    // Getter e Setter de Valor
    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        this.Valor = valor;
    }
    
    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
    
    public String toString() {
    return String.format(
        "CÓDIGO: %d\nNOME: %s\nTIPO: %s\nVALOR: %.2f\nQUANTIDADE: %d\n",
        Codigo, Nome, Tipo, Valor, Quantidade
    );
}
}
