/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author francisco.reyes
 */
public class CrearDirectorio {
    File directorio;
    
    private void crearDirectory(){
        directorio = new File("carpeta");
        
        if(directorio.mkdir()){
            System.out.println("El directorio se a creado");
        }else{
            System.out.println("No se creo el directorio");
        }
    }
    public static void main(String[] args) {
        CrearDirectorio ca = new CrearDirectorio();
        
        ca.crearDirectory();
        
        
    }
    
}
