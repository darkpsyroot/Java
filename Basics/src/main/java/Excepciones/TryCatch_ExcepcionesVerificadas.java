/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import Arreglos.LibroCalificaciones.PruebaLibroCalificaciones;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author francisco.reyes
 */
public class TryCatch_ExcepcionesVerificadas {

    public void leerArchivo() throws FileNotFoundException, IOException{
        File archivo = new File("C:\\Users\\francisco.reyes\\Documents\\darkpsyroot\\Git\\ssh-key");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;
        
        while ((linea = bf.readLine()) != null) {
            System.out.println(linea);
        }
    }

    public void leerArchivo2(){
        try {
            leerArchivo();
        } catch (FileNotFoundException fne) {
            JOptionPane.showMessageDialog(null, "no se ha encontrado el archivo deseado");
        }catch(IOException ie){
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");
        }
        
        System.out.println("Probrama terminado");
    }
    
    public static void main(String[] args) {
        TryCatch_ExcepcionesVerificadas tc = new TryCatch_ExcepcionesVerificadas();
        tc.leerArchivo2();
    }

}
