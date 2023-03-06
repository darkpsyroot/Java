/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo;

/**
 *
 * @author francisco.reyes
 */
public class ParametrosYArgumentosOperacion {

    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos
    //Metodo suma
    public void sumar(int numero1, int numero2/*Parametros*/) {
        suma = numero1 + numero2;
    }

    //metodo resta
    public void restar(int numero1, int numero2/*Parametros*/) {
        resta = numero1 - numero2;
    }

    //Método Multiplicacion
    public void multiplicar(int numero1, int numero2/*Parametros*/) {
        multiplicacion = numero1 * numero2;
    }

    //Método que divide
    public void dividir(int numero1, int numero2/*Parametros*/) {
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
