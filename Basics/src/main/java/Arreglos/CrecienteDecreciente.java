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
public class CrecienteDecreciente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[10];
        boolean creciente = false, decreciente = false;

        System.out.println("llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". ingrese el numero: ");
            arreglo[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (arreglo[i] < arreglo[i + 1]) {//Creciente 1, 2, 3, ...
                creciente = true;
            }
            if (arreglo[i] > arreglo[i + 1]) {//Decreciente 3, 2, 1, ...
                decreciente = true;
            }
        }

        if (creciente == true && decreciente == false) {
            System.out.println("\nEs arreglo está en forma creciente");
        } else if (creciente == false && creciente == true) {
            System.out.println("\nEl arreglo está en forma decreciente");
        } else if (creciente == true && decreciente == true) {
            System.out.println("\nEl arreglo está desordenado");
        } else if (creciente == false && decreciente == false) {
            System.out.println("\nTodos los numeros del arreglo estan desordenados");
        }
    }
}
