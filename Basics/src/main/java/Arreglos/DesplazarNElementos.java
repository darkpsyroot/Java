/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author francisco.reyes
 */
public class DesplazarNElementos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[10];
        int n_posicion, ultimo;

        System.out.println("LLenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ". Digite un numero: ");
            arreglo[i] = sc.nextInt();
        }

        System.out.print("\nDigite la cantidad de posiciones a desplazar: ");
        n_posicion = sc.nextInt();

        for (int vuelta = 1; vuelta <= n_posicion; vuelta++) {
            ultimo = arreglo[9];//Guardamos el ultimo elemento de arreglo
            for (int i = 8; i >= 0; i--) {//Desplazando una posicion en el arreglo 
                arreglo[i + 1] = arreglo[i];
            }
            arreglo[0] = ultimo;//Ponemos el ultimo elemento como el primero
        }

        System.out.println("\nEl arreglo resultante es: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ". elemento: " + arreglo[i]);
        }
    }
}
