/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author francisco.reyes
 */
public class Main {

    public static void main(String[] args) {
        List<Operacion> operaciones = new ArrayList<Operacion>();
        operaciones.add(new Suma());
        operaciones.add(new Resta());
        operaciones.add(new Multiplicacion());

        ejecutarEImprimir(operaciones, 6, 4);
    }

    private static void ejecutarEImprimir(List<Operacion> operaciones, int operando1, int operando2) {
        for (Operacion operacion : operaciones) {

            operacion.ejecutar(operando1, operando2);
            operacion.mostrarUltimoResultado();
        }
    }
}
