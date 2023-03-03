/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.reyes
 */
public class ParametrosYArgumentosMain {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        ParametrosYArgumentosOperacion calc = new ParametrosYArgumentosOperacion();
        
        //El argumento es el valor que se le da a un parametrp
        calc.sumar(numero1,numero2/*Argumento*/);
        calc.restar(numero1,numero2/*Argumento*/);
        calc.multiplicar(numero1,numero2/*Argumento*/);
        calc.dividir(numero1,numero2/*Argumento*/);
        calc.mostrarResultados();
    }
    
}
