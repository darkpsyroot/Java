/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos.bidimencional;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author francisco.reyes
 */
public class LlenarArreglo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][], nFilas, nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz = new int[nFilas][nCol];
        
        System.out.println("Digite la matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz ["+1+"]"+"["+j+"]: ");
                matriz[i][j] = sc.nextInt();
            }
            
        }
        
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}
