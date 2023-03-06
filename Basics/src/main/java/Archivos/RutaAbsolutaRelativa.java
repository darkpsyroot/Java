/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.File;

/**
 *
 * @author francisco.reyes
 */
public class RutaAbsolutaRelativa {

    public static void main(String[] args) {
        //File archivo = new File("C:\\Users\\francisco.reyes\\Documents\\darkpsyroot\\Git\\globalconfig");
        //ruta telativa
        File archivo = new File("prueba.txt");

        if (archivo.exists()) {
            System.out.println("El archivo existe y su ruta absoluta es\n "+ archivo.getAbsolutePath());
            System.out.println("El archivo existe?"+archivo.isFile());
            System.out.println("Se puede leer?"+archivo.canRead());
            System.out.println("Se puede escribir??"+archivo.canWrite());
            System.out.println("Se puede ejecutar?"+archivo.canExecute());
        }else{
            System.out.println("El archivo no existe");

        }
    }
}
