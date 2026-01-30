/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Clientes;


/**
 *
 * @author jpaul
 */
public class ClientesCodec implements Codec<Clientes> {

    @Override
    public Clientes Parse(String linha) {
        String[] array = linha.split(";");
        return new Clientes(array[0],array[1],array[2],array[3]);
    }
    
    @Override
    public String Serializer(Clientes obj){
        return String.format("%s;%s;%s;%s",obj.getNome(),obj.getCelular(),obj.getCPF(),obj.getEndereco());
    
    }
    
}
