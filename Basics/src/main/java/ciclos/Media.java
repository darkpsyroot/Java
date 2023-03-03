/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.reyes
 */
public class Media {

    public static void main(String[] args) {
        int numero, positivos = 0, negativos = 0, ceros = 0, sumaPositivos = 0, sumaNegativos = 0;
        float media_potivos = 0, media_negativos = 0;

        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digita 10 numeros"));
            if (numero == 0) {
                ceros++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                negativos++;
            } else {
                sumaPositivos += numero;
                positivos++;
            }
        }
        media_potivos = (float) sumaPositivos / positivos;
        media_negativos = (float) sumaNegativos / negativos;
        System.out.println("Media Positivos: " + media_potivos);
        System.out.println("Media Negativos: " + media_negativos);
        System.out.println("Total de ceros: " + ceros);
    }

}
