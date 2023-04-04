/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrrList;

import java.util.*;

/**
 *
 * @author francisco.reyes
 */
public class ArrayLists {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona(1, "paco", 30));
        
        for(Persona perso: lista){
            System.out.println("prueba: "+ perso.getNombre());
            System.out.println("prueba: "+ perso.getNum());
            System.out.println("prueba: "+ perso.getEdad());
        }
    }
    
}
