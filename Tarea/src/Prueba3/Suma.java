/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba3;

/**
 *
 * @author francisco.reyes
 */
public class Suma extends Operacion {

    @Override
    public int ejecutar(int op1, int op2) {
        ultimoResultado = op1 + op2;
        return ultimoResultado;
    }

    @Override
    public void mostrarUltimoResultado() {
        System.out.println(String.format("Resultado última Suma: '%d'",
                ultimoResultado));
    }
}
