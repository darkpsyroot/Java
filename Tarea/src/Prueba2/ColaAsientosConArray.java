/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author francisco.reyes
 */
public class ColaAsientosConArray implements ColaAsientos {

    static int opc = 0, numero;
    static Scanner sc = new Scanner(System.in);
    
    
    static Stack<Integer> asiento = new Stack<>();

    
    
    public static void main(String[] args) {
        System.out.println("===\tCobis Topas\t===");
        
        for (int i = 1; i <= 1000; i++) {
            asiento.add(i);
        }
        
        
        System.out.println("Asientos totales: \t" + asiento.size());

        do {
            System.out.print("\n\nPilas y Colas"
                    + "\n1. Agregar numero"
                    + "\n2. Eliminar numero"
                    + "\nIngresa una opcion: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Numero: ");
                    numero = sc.nextInt();
                    encolar(numero);
                    for (Integer i : asiento) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    System.out.println("Eliminar el ultimo elemento"
                            + " de la lista");
                    desencolar();
                    for (Integer i : asiento) {
                        System.out.println(i);
                    }
                    break;
                
            }

        } while (opc != 3);
    }

    static void encolar(int i) {
        asiento.push(i);
    }

    static void desencolar() {
        asiento.pop();
    }

}
