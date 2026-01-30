/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author jpaul
 */
public class Usuario {
    private String loginUsuario;
    private String loginSenha;
      
    
    public Usuario(String loginUsuario,String loginSenha){
    this.loginUsuario = loginUsuario;
    this.loginSenha = loginSenha;
    }
    
    public String getLoginUsuario(){
    return loginUsuario;
    }
    
    public String getLoginSenha(){
    return loginSenha;
    }
    
    
    
}


