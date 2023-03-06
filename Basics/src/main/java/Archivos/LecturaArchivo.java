/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import jdk.jfr.events.FileWriteEvent;

/**
 *
 * @author francisco.reyes
 */
public class LecturaArchivo {
    
    File archivo = new File("File.txt");
    
    private void leerArchivo(){
        String cadena;
        try {
            FileReader fw = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fw);
            System.out.println("Abriendo archivo para la lectura del texto");
            cadena = br.readLine();
            while (cadena != null) {
                System.out.println(cadena);
                cadena = br.readLine();
                
            }
            
        } catch (IOException e) {
            System.err.println("No se pudo leer el texto");
        }
    }
    
    public static void main(String[] args) {
        LecturaArchivo la = new LecturaArchivo();
        
        la.leerArchivo();
    }
    
}
