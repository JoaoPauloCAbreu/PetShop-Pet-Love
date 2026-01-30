/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;


import Entities.Produtos;

/**
 *
 * @author jpaul
 */
public class ProdutoCodec implements Codec<Produtos> {

    @Override
    public Produtos Parse(String linha) {
        String[] array = linha.split(";");
        return new Produtos(Integer.parseInt(array[0]),array[1],array[2],Double.parseDouble(array[3]),Integer.parseInt(array[4]));
    }

    @Override
    public String Serializer(Produtos obj) {
        return String.format("%s;%s;%s;%s;%s",obj.getCodigo(),obj.getNome(),obj.getTipo(),obj.getValor(),obj.getQuantidade());
    }
    
}
