/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo;

/**
 *
 * @author francisco.reyes
 */
public class RetornoDeValoresOperacion {

    /* 
    *******************
    ******Métodos******  
    *******************
     */

 /* Sumar */
    public int sumar(int numero1, int numero2/*Parametros*/) {
        int suma = numero1 + numero2;
        return suma;
    }

    /* Restar */
    public int restar(int numero1, int numero2/*Parametros*/) {
        int resta = numero1 - numero2;
        return resta;
    }

    /* Multiplicar */
    public int multiplicar(int numero1, int numero2/*Parametros*/) {
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    /* Dividir */
    public int dividir(int numero1, int numero2/*Parametros*/) {
        int division = numero1 / numero2;
        return division;
    }

    //Método para mostrar resultados
    public void mostrarResultados(int suma, int resta, int multiplicacion, int division) {
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }

}
