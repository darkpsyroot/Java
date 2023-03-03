/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos.LibroCalificaciones;

/**
 *
 * @author francisco.reyes
 */
public class PruebaLibroCalificaciones {

    public static void main(String[] args) {
        int[][] arregloCalif = {
            /*a*/ /*b*/ /*c*/
            /*1*/{87, 96, 70},
            /*1*/ {68, 87, 90},
            /*1*/ {94, 100, 90},
            /*1*/ {100, 81, 82},
            /*1*/ {83, 65, 85},
            /*1*/ {78, 87, 65},
            /*1*/ {85, 75, 83},
            /*1*/ {91, 94, 100},
            /*1*/ {76, 72, 84},
            /*1*/ {87, 93, 73}
        };

        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(
                "Arreglos multidimencionales",
                arregloCalif);

        System.out.printf("Bienvenido al libro de calificaciones para%n%s%n%n", miLibroCalificaciones.getNombreDelCurso());
        miLibroCalificaciones.procesaCalifiaciones();
    }
}
