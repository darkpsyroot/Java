/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.reyes
 */
public class Factorial {

    public static void main(String[] args) {
        int numero;
        long factorial = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

}
