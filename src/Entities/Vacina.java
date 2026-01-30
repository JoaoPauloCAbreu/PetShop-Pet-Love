/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.time.LocalDate;

/**
 *
 * @author jpaul
 */
public class Vacina {
    private int Codigo;
    private String Nome;
    private String Tipo;
    private Double Valor;
    private int Quantidade;
    private String Data;
    
    public Vacina(int codigo, String nome, String tipo, Double valor, int quantidade,String Data) {
        this.Codigo = codigo;
        this.Nome = nome;
        this.Tipo = tipo;
        this.Valor = valor;
        this.Quantidade = quantidade;
        this.Data = Data;
       
    }
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    // Getter e Setter para Nome
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    // Getter e Setter para Tipo
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    // Getter e Setter para Valor
    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        this.Valor = valor;
    }

    // Getter e Setter para Quantidade
    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.Quantidade = quantidade;
    }
    
    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }
    
    public String toString() {
    return String.format(
        "CÓDIGO: %d\nNOME: %s\nTIPO: %s\nVALOR: %.2f\nQUANTIDADE: %d\nDATA: %s\n",
        Codigo, Nome, Tipo, Valor, Quantidade, Data
    );
}

}
