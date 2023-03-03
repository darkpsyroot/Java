/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

/**
 *
 * @author francisco.reyes
 */
public class ArregloMultidimencional {

    public static void main(String[] args) {
        int[][] arregloMultidimencional = {{0}, {1, 2}, {3, 4, 5}, {6, 7, 8, 9}};

        //Recorremos la cantidad de elementos del arreglo
        for (int[] arregloMultidimencional1 : arregloMultidimencional) {
            //Se recorre la cantidad de obtejos que contiene cada elemento
            for (int columna = 0; columna < arregloMultidimencional1.length; columna++) {
                System.out.print(arregloMultidimencional1[columna] + " ");
            }
        }
    }
}
