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
public class ElementosIntercalados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ": ");
            numero[i] = sc.nextInt();
        }

        System.out.println("Elementos intercalados");
        for (int i = 0; i < 5; i++) {
            System.out.print(numero[i] + " ");//primer elemento del arreglo
            System.out.print(numero[9 - i] + " ");//ultimo elemento del arreglo

        }
    }

}
