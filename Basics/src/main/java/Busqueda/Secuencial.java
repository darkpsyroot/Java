/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Busqueda;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.reyes
 */
public class Secuencial {

    public static void main(String[] args) {
        int arreglo[] = {4, 1, 5, 2, 3};
        int dato;
        boolean band = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero abuscar"));

        //busqueda secuencial
        int i = 0;
        while (i < 5 && band == false) {
            if (arreglo[i] == dato) {
                band = true;
            }
            i++;
        }
        if (band == false) {
            JOptionPane.showMessageDialog(null, "El elemento no se encuentra en el arreglo");
        } else {
            //el i -1 señalamos la posicion excata en la que lo hermos encontrado
            JOptionPane.showMessageDialog(null, "El elemento ha sido encontrado en la posicion" + (i - 1));
        }
    }

}
