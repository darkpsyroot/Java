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
public class AtributosYMetodosOperacion {

    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //metodos
    //Metodo para pedirle al usuario que digite 2 numeros
    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    }

    //Metodo suma
    public void sumar() {
        suma = numero1 + numero2;
    }

    //metodo resta
    public void restar() {
        resta = numero1 - numero2;
    }

    //Método Multiplicacion
    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }

    //Método que divide
    public void dividir() {
        division = numero1 / numero2;
    }

    //Método para mostrar resultados
    public void mostrarResultados() {
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }

}
