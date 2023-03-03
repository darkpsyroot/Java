/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author francisco.reyes
 */
public class MetodoConstructorOperacion {

    /* 
    *********************
    ******Atributos******  
    *********************
     */
    String nombre;
    int edad;

    /* 
    ******************************
    ******Método Constructor******  
    ******************************
     */
 /*
    *El metodo contructos inicializa los atributos de la clase*
    **No develve ningun valor
    **Debe decrararse como publico
    **Debe tener el mismo nombre de la clase
     */
 /*Metodo contructor opcion 1
    public Persona(String _nombre, int _edad){
        nombre = _nombre;
        edad = _edad;
    }*/
    //Metodo contructor opcion 2
    public MetodoConstructorOperacion(String nombre, int edad) {
        this.nombre = nombre; //El this indica el atributo igualando a el parametro local
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }

}
