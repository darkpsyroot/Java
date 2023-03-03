/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.reyes
 */
public class CalculoPromedio {

    public static void main(String[] args) {
        float estatura, estaturaMedia, sumaEstatura = 0;
        int edad = 0, cantidadAlumnosMayores = 0, edadMedia, cantidadEstatura = 0, contadorEdad = 0, contadorEstatura = 0, sumaEdad = 0;

        for (int i = 1; i < 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog(i + ": Digita tu edad"));
            estatura = Float.parseFloat(JOptionPane.showInputDialog(i + ": Digita tu estatura"));

            if ((edad > 0 && edad < 100) && (estatura > 0 && estatura < 2.5)) {
                contadorEdad++;
                contadorEstatura++;
                sumaEdad += edad;
                sumaEstatura += estatura;
                if (edad > 18) {
                    cantidadAlumnosMayores++;
                }
                if (estatura == 1.75) {
                    cantidadEstatura++;
                }
            }
        }
        edadMedia = sumaEdad / contadorEdad;
        estaturaMedia = sumaEstatura / contadorEstatura;

        System.out.println("Edad media: " + edadMedia);
        System.out.println("Estatura media: " + estaturaMedia);

        System.out.println("Alumnos mayores de 18: " + cantidadAlumnosMayores);
        System.out.println("Alumnos que miden 1.75: " + cantidadEstatura);

    }
}
