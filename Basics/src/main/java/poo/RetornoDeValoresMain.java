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
public class RetornoDeValoresMain {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        RetornoDeValoresOperacion op = new RetornoDeValoresOperacion();

        /*Opcion 1
        int suma = op.sumar(n1,n2);
        int resta = op.restar(n1,n2);
        int multipicacion = op.multiplicar(n1,n2);
        int dividir = op.dividir(n1,n2);
        
        op.mostrarResultados(suma, resta, multipicacion, dividir);*/
 /*Opción 2*/
        System.out.println("Suma: " + op.sumar(n1, n2/*Argumento*/));
        System.out.println("Resta: " + op.restar(n1, n2/*Argumento*/));
        System.out.println("Multiplicacion: " + op.multiplicar(n1, n2/*Argumento*/));
        System.out.println("Division: " + op.dividir(n1, n2/*Argumento*/));
    }
}
