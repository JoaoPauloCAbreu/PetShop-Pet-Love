/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Pets;

/**
 *
 * @author jpaul
 */
public class PetsCodec implements Codec<Pets> {

    @Override
    public Pets Parse(String linha) {
         String[] array = linha.split(";");
         return new Pets(array[0],array[1],Integer.parseInt(array[2]),array[3],array[4],array[5]);
    }

    @Override
    public String Serializer(Pets obj) {
        return String.format("%s;%s;%s;%s;%s;%s",obj.getNome(),obj.getRaca(),obj.getIdade(),obj.getEspecie(),obj.getTutor(),obj.getSexo());
    }
    
}
