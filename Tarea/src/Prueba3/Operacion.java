/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba3;

/**
 *
 * @author francisco.reyes
 */
public abstract class Operacion {
     
      protected int ultimoResultado;
     
      public abstract int ejecutar(int op1, int op2);
 
      public void mostrarUltimoResultado() {
            System.out.println(String.format("Resultado última operación: '%d'", ultimoResultado));
      }
}

