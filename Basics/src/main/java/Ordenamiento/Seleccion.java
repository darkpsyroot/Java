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
public class Seleccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[], nElementos,min, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de elementos del arreglo"));
        
       arreglo = new int [nElementos];
       
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+". Digite un numero: "); 
            arreglo[i] = sc.nextInt();
        }
        
        //Ordenamiento por selección
        //Recorremos posiciones
        for (int i = 0; i < nElementos; i++) {
            //Guardamos el primer elemento del arreglo
            min = i;
            //Recorremos el arreglo desde la segunda posicion
            for (int j = i+1; j < nElementos; j++) {
                //si el valor en la segunda posicion de arreglo es menor al
                //al valor del promer elemento
                if(arreglo[j] < arreglo[min]){
                    //guardamos el elemento mas chico
                    min = j;
                }
                
            }
            //guardamos el primer elemento del arreglo que debe ser mayor
            //que el segundo elemento
            aux = arreglo[i];
            //Guardamos en la primera posición del arreglo el valor
            // del numero mas chico
            arreglo[i] = arreglo[min];
            
            //sustituimos el valor del elemento cas chico encontrado en el arreglo
            arreglo[min] = aux;
            
        }
        
        System.out.println("\nordenado de forma creciente");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i]);   
        }
        
        System.out.println("\nDecreciente");
        for(int i = nElementos-1; i>=0;i--){
            System.out.print(arreglo[i]);   
        }
    }
    
}
