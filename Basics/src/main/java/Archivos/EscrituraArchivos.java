/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author francisco.reyes
 */
public class EscrituraArchivos {

    private final File archivo = new File("File.txt");

    private void escribirTexto() {
        try {
            FileWriter fw = new FileWriter(archivo);
            fw.write("\n\nDark4i20psy");
            fw.close();
            System.out.println("se escribió texto al archivo");
        } catch (IOException ex) {
            System.err.println("Archivo sin cambio" + ex);
        }

    }

    public static void main(String[] args) {
        EscrituraArchivos ea = new EscrituraArchivos();
        ea.escribirTexto();
    }

}
