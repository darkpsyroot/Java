/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author francisco.reyes
 */
public class CrearArchivo {
    File archivo;
    
    private void crearArchiivo(){
        archivo = new File("File.txt");
             
        try {
            if(archivo.createNewFile()){
                System.out.println("El archivo se a creado");
            }
        } catch (IOException ex) {
            //Este catch solo salta con la ruta absoluta
            System.err.print("No exite la ruta absoluta " + ex);
        }
    }
    public static void main(String[] args) {
        CrearArchivo ca = new CrearArchivo();
        
        ca.crearArchiivo();
        
    }
    
}
