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
public class Calificaciones {
    public static void main(String[] args) {
        float notas;
        int aprobados = 0, condicionados = 0, suspensos = 0;

        for (int i = 1; i <= 6; i++) {
            do {
                notas = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota " + i + ": "));    
            } while (notas < 0 || notas > 10);//notra esta en el intervalo de 0-10
             //Siempre es bueno poner el intervalo de los rango qque quieres hacer
            
            
            if(notas < 4) {
                suspensos++;
            }else if(notas == 4){
                condicionados++;
            }else{
                aprobados++;
            }
        }

        System.out.println("Alumnos aprobados: "+aprobados);
        System.out.println("Alumnos condicionados: "+condicionados);
        System.out.println("Alumnos suspensos: "+suspensos);
        
    }
}
