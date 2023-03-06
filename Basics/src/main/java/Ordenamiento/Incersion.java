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
public class Incersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[], nElementos,pos, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de elementos del arreglo"));
        
       arreglo = new int [nElementos];
       
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+". Digite un numero: "); 
            arreglo[i] = sc.nextInt();
        }
        
        for (int i = 0; i < nElementos; i++) {//recorremos la cantidad de elementos del arreglo
            pos = i;//guardamos la posicion donde nos encontramos
            aux = arreglo[i];//guardamos el valor del arreglo
            
            //Comparamos el segundo elemento con el primero
            while((pos > 0) && (arreglo[pos-1]> aux)){
                //recorremos a la siguente posicion del arreglo hacia atras
                arreglo[pos] = arreglo[pos-1];
                //el elemento que estaba a la izquierda se recorre a la derecha
                pos--;
            }
            
            //copiamos en la ´posición siguiente el valor del primer elemento
            arreglo[pos] = aux;
        }
        
        //Mostrando el arreglo ordenado de forma creciente
        System.out.println("\nArreglo ordenado en forma creciente");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i]+ " - ");
        }
        
        //Mostrando el arreglo en forma decreciente
        System.out.println("\nArreglo ordenado en forma decreciente");
        
        for (int i = nElementos-1; i >= 0; i--) {
            System.out.print(arreglo[i]+ " - ");
        }
    }
}