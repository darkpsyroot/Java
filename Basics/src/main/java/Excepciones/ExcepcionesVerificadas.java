/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author francisco.reyes
 */
public class ExcepcionesVerificadas {
    
    public void leerArchivo() throws FileNotFoundException{
        File archivo = new File("C:\\Users\\francisco.reyes\\Documents\\darkpsyroot\\Git\\ssh-key");
        FileReader fr = new FileReader(archivo);
    }
    
    public void leerArchivo2() throws IOException{
        leerArchivo();
    }
    
}
