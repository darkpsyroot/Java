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
public class CalculoPromedio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0, negativos = 0, contadorCeros = 0;
        float numero, mediaPositivos = 0, mediaNegativos = 0;
        float[] elementos = new float[5];

        System.out.println("Digita 5 numeros");
        for (int i = 0; i < elementos.length; i++) {
            System.out.print((i + 1) + ": ");
            numero = sc.nextFloat();
            elementos[i] = numero;
            if (numero > 0) {
                positivos++;
                mediaPositivos = (float) positivos / elementos.length;
            } else if (numero < 0) {
                negativos++;
                mediaNegativos = (float) negativos / elementos.length;
            } else {
                contadorCeros++;
            }
        }

        System.out.println("\nElementos del arreglo");
        for (float f : elementos) {
            System.out.print(f + " ");
        }

        System.out.println("\n\nMedia de los numeros positivos: " + mediaPositivos);
        System.out.println("Media de los numeros negativos: " + mediaNegativos);
        System.out.println("Número de ceros: " + contadorCeros);

    }
}
