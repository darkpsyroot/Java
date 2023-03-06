/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author francisco.reyes
 */
public class AñadirTexto {

    private File archivo = new File("File.txt");

    private void añadirTexto() {
        
            FileWriter fw;
        try {
            fw = new FileWriter(archivo, true);
            fw.write("Añadiendo texto al archivo");
            fw.write("\r\nSe inserto texto texto al archivo");
            fw.close();
            System.out.println("\nTexto añadido");
        } catch (IOException ex) {
            System.out.println("\rNo se añadio texto");
        }
    }

    public static void main(String[] args) {
        AñadirTexto at = new AñadirTexto();

        at.añadirTexto();

    }
}
