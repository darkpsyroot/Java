/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo;

/**
 *
 * @author francisco.reyes
 */
public class EncapsulamientoOpc {
    //La variable no puede ser modificadar desde una instancia
    private int edad;
    private String nombre;

    //Establecer edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //MostrarEdad
    public int getEdad() {
        return edad;
    }
    
    //Mostrar nombre
    public String getNombre() {
        return nombre;
    }

    //establecer nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
