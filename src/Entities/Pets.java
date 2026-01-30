/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author jpaul
 */
public class Pets {
    private String Nome;
    private String Raca;
    private int Idade;
    private String Especie;
    private String CPFTutor;
    private String Sexo;
    
    
    
public Pets(String Nome,String Raca,int Idade,String Especie,String CPFTutor,String Sexo){
    this.Nome = Nome;
    this.Raca = Raca;
    this.Idade = Idade;
    this.Especie = Especie;
    this.CPFTutor = CPFTutor;
    this.Sexo = Sexo;
}
    
    
public String getNome() {
    return Nome;
}

public void setNome(String Nome) {
    this.Nome = Nome;
}

public String getRaca() {
    return Raca;
}

public void setRaca(String Raca) {
    this.Raca = Raca;
}

public int getIdade() {
    return Idade;
}

public void setIdade(int Idade) {
    this.Idade = Idade;
}

public String getEspecie() {
    return Especie;
}

public void setEspecie(String Especie) {
    this.Especie = Especie;
}

public String getTutor() {
    return CPFTutor;
}

public void setTutor(String CPFTutor) {
    this.CPFTutor = CPFTutor;
}

public String getSexo() {
    return Sexo;
}

public String toString() {
    return String.format(
        "NOME: %s\nRAÇA: %s\nIDADE: %d\nESPÉCIE: %s\nCPF TUTOR: %s\nSEXO: %s\n",
        Nome, Raca, Idade, Especie, CPFTutor, Sexo
    );
}

}
