/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Usuario;

/**
 *
 * @author jpaul
 */
public class UsuariosCodec implements Codec<Usuario> {
  
    @Override
    public Usuario Parse(String linha) {
         String[] array = linha.split(";");
         return new Usuario(array[0],array[1]);
    }

    @Override
    public String Serializer(Usuario obj) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
