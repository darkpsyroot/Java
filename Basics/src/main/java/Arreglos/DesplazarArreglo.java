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
public class DesplazarArreglo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[10];
        int numero, posicion;

        System.out.println("Llenamos el arreglo");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            arreglo[i] = sc.nextInt();
        }

        System.out.println("\nDigite un numero: ");
        numero = sc.nextInt();
        System.out.println("\nDigite una posicion: ");
        posicion = sc.nextInt();

        //Correr una posicion los elementos detras de la posicion que el usuario quiere
        for (int i = 7; i >= posicion; i--) {//1-2-3-numero-4-5-6
            arreglo[i + 1] = arreglo[i];
        }

        arreglo[posicion] = numero;
        System.out.println("\nEl nuevo arreglo es: ");
        for (int i = 0; i < 9; i++) {
            System.out.println("Posicion " + i + ": " + arreglo[i]);
        }

    }
}
