/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Produtos;
import Entities.Vacina;

/**
 *
 * @author jpaul
 */
public class VacinaCodec implements Codec<Vacina> {

    @Override
    public Vacina Parse(String linha) {
        String[] array = linha.split(";");
        return new Vacina(Integer.parseInt(array[0]),array[1],array[2],Double.parseDouble(array[3]),Integer.parseInt(array[4]),array[5]);
    }

    @Override
    public String Serializer(Vacina obj) {
        return String.format("%s;%s;%s;%s;%s;%s",obj.getCodigo(),obj.getNome(),obj.getTipo(),obj.getValor(),obj.getQuantidade(),obj.getData());
    }
    
}
