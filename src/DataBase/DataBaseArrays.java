/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import Entities.Clientes;
import Entities.Pets;
import Entities.Produtos;
import Entities.Vacina;
import java.util.ArrayList;

/**
 *
 * @author jpaul
 */
public class DataBaseArrays {
    public static final ArrayList<Clientes> ArrayClientes = new ArrayList<>();
    public static final ArrayList<Pets> ArrayPets = new ArrayList<>();    
    public static final ArrayList<Produtos> ArrayProdutos = new ArrayList<>();
    public static final ArrayList<Vacina> ArrayVacina = new ArrayList<>();
    
    
    public static void setArrayClientes(ArrayList<Clientes> ArrayTempClientes){
    ArrayClientes.clear();
    ArrayClientes.addAll(ArrayTempClientes);
    }
    
    public static void setArrayPets(ArrayList<Pets> ArrayTempPets){
    ArrayPets.clear();
    ArrayPets.addAll(ArrayTempPets);
    }
    
    public static void setArrayProdutos(ArrayList<Produtos> ArrayTempProdutos){
    ArrayProdutos.clear();
    ArrayProdutos.addAll(ArrayTempProdutos);
    }
    
    public static void setArrayVacina(ArrayList<Vacina> ArrayTempVacina){
    ArrayVacina.clear();
    ArrayVacina.addAll(ArrayTempVacina);
    }
    
}
