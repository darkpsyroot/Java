/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author francisco.reyes
 */
public class AppTransacciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Asiento asiento = new Asiento();
        
        int opc;
        
        try {
                do{
                    System.out.print(""
                            + "\n=========COBIS TOPAS========="
                            + "\n1. Realizar transaccion"
                            + "\n2. Listar transaccion"
                            + "\n3. Asiento contable"
                            + "\n4. Listar Asiento contable"
                            + "\n5. Salir"
                            + "\nPorfavor digita una opcion: ");
                    opc = sc.nextInt();
                    
                    switch (opc) {
                        case 1:
                            asiento.addTransacciones();
                            break;
                        case 2:
                            asiento.getTransaccion();
                            
                            break;
                        case 3:
                            asiento.addBalance();
                            
                            break;
                        default:
                            throw new AssertionError();
                    }
                    
                }while(opc != 4);
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
 
    }
}
