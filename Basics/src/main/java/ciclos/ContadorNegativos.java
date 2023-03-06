/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.reyes
 */
public class ContadorNegativos {

    public static void main(String[] args) {
        int numero, conteoNegativos = 0;
        boolean negativo = false;

        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if (numero < 0) {
                negativo = true;
                conteoNegativos++;
            }
        }
        if (negativo == true) {
            JOptionPane.showMessageDialog(null, "Se han introducido " + conteoNegativos + " numeros negativos");
        } else {
            System.out.println("No hay numeros negativos");
        }
    }
}
