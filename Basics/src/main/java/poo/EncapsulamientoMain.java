/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author francisco.reyes
 */
public class EncapsulamientoMain {
    public static void main(String[] args) {
        EncapsulamientoOpc opc = new EncapsulamientoOpc();
        
        opc.setNombre("Francisco");
        System.out.println("Mi nombre es: "+opc.getNombre());
        
        opc.setEdad(28);
        System.out.println("tengo: "+opc.getEdad()+" años");
        
        
    }
    
}
