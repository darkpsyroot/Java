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
public class MezclarArreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[], b[], c[];

        a = new int[10];
        b = new int[10];
        c = new int[20];

        System.out.println("LLenar arrglo A");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ":");
            a[i] = sc.nextInt();
        }
        System.out.println("LLenar arreglo B");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ":");
            b[i] = sc.nextInt();
        }
        System.out.println("LLenar arrglo C");

        int j = 0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i]; //A
            j++;
            c[j] = b[i]; //B
            j++;
        }

        System.out.println("El tercer arreglo es");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
