/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author francisco.reyes
 */
public class ExcepcionesPersonalizadasMain {

    private int numero;
    private Scanner entrada;

    public void introducirNumeros() throws ExcepcionesPersonalizadasOpc {
        entrada = new Scanner(System.in);

        do {
            System.out.println("Digite un numero");
            numero = entrada.nextInt();

            if (numero == 0) {
                throw new ExcepcionesPersonalizadasOpc();
            }
        } while (numero != 0);
    }

    public static void main(String[] args) throws ExcepcionesPersonalizadasOpc {
        ExcepcionesPersonalizadasMain prueba = new ExcepcionesPersonalizadasMain();

        try {
            prueba.introducirNumeros();
        } catch (ExcepcionesPersonalizadasOpc e) {
            System.out.println("ha introducido un muero 0");
        }
        System.out.println("Programa terminado");
    }

}
