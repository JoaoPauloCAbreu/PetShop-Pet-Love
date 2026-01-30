/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jpaul
 */
public class LeitorEEscritor {
    public static <T> ArrayList<T> Ler(File Path,Codec<T> parser){
        ArrayList<T> lista = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(Path))) {
            String linha;

            while((linha = br.readLine()) != null) {
                
                if (linha.trim().isEmpty()) {
                    continue;
                }
                
                T obj = parser.Parse(linha);  // transforma a linha no objeto correto
                lista.add(obj);
            }

        } catch(IOException e) {
            e.printStackTrace();
        }

        return (ArrayList<T>) lista;
    }
    
     public static <T> void Escrever(File Path, ArrayList<T> lista, Codec<T> parser, boolean status){
        if(status == false){
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(Path))){
                for(T obj : lista){
                    String Linha;
                    Linha = parser.Serializer(obj);
                    bw.write(Linha);
                    bw.newLine();
                }
            
            }catch(IOException e){}
        }else{
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(Path,true))){
                
                    String Linha;
                    Linha = parser.Serializer(lista.get(lista.size()-1));
                    bw.write(Linha);
                    bw.newLine();
                
            
            }catch(IOException e){}
        
        
        }
         
     }
    
    
}
