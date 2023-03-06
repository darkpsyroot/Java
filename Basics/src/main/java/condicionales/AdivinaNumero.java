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
public class AdivinaNumero {

    public static void main(String[] args) {
        int numero, aleatorio, contador = 0;

        //generar numero *100 para centenas
        //10 para decenas
        aleatorio = (int) (Math.random() * 10);

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            if (aleatorio > numero) {
                System.out.println("Digite un numero mayor");
            } else {
                System.out.println("Digite un numero menor");
            }
            contador++;
        } while (numero != aleatorio);

        System.out.println("\nGenial!! Adivinaste el numero en " + contador + " intentos");
    }

}
