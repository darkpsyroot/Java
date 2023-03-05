/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author francisco.reyes
 */
public class SobrecargaMetodosMain {
    //Atributos
    String nombre;
    int edad;
    String dni;
    
    //Sobrecarga metodo contructor

    public SobrecargaMetodosMain(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public SobrecargaMetodosMain(String dni) {
        this.dni = dni;
    }
    
    //Sobrecarga de metodos
    public void correr(){
        System.out.println("Soy"+nombre+" Francisco Reyes"+" y me compre una moto");
    }
    public void correr(int costo){
        System.out.println("La moto costo $100.000");
    }
    
}
