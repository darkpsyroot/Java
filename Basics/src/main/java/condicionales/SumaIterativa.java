/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.reyes
 */
public class SumaIterativa {

    public static void main(String[] args) {
        int numero, suma = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        do {
            suma += numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro  numero"));

        } while (numero != 0);

        System.out.println("La suma total es: " + suma);

    }
}
