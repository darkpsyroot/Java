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
public class ParImpar {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println(numero + "\tpar");
            } else {
                System.out.println(numero + "\timpar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero o 0 para finalizar"));
        }
        System.out.println("Fin del programa...");
    }
}
