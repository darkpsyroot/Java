/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author francisco.reyes
 */
public class MiembrosEstaticos {
    /*Un atributo estático de la clase solo puede
     ser instanciado por la misma clase
     Este atributo ya no le pertenece al objeto sino 
     a la clase*/
    private static String frase = "Soy un atributo de la clase y no puedo modificar mi valor";
    
    public static int suma(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(MiembrosEstaticos.frase);
        System.out.println("La suma es" + MiembrosEstaticos.suma(4, 9));
        
    }
    
}


