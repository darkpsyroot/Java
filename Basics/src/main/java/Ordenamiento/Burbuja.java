/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author francisco.reyes
 */
public class Burbuja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de elementos del arreglo"));

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            arreglo[i] = sc.nextInt();
        }

        for (int i = 0; i < (nElementos - 1); i++) {//recorremos la cantidad de elementos del arreglo
            for (int j = 0; j < (nElementos - 1); j++) {//recorremos cada elemento del arreglo
                if (arreglo[j] > arreglo[j + 1]) {//si  numeroactual > numerosiguiente
                    //aux toma el valor del arreglo en el indice 0
                    //copias el numero
                    aux = arreglo[j];

                    //te recorres al siguiente elemento del arrejo con el +1
                    arreglo[j] = arreglo[j + 1];
                    //Se pega el valor de aux el el siguiente elemento
                    arreglo[j + 1] = aux;
                }

            }
        }

        //Mostrando el arreglo ordenado de forma creciente
        System.out.println("\nArreglo ordenado en forma creciente");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        //Mostrando el arreglo en forma decreciente
        System.out.println("\nArreglo ordenado en forma decreciente");

        for (int i = nElementos - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
    }
}
