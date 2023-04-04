/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba1;

import java.util.Scanner;

/**
 *
 * @author francisco.reyes
 */
public class AppEj1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Asiento asiento = new Asiento();
        
        int opc;
        
        try {
                do{
                    System.out.print(""
                            + "\n=========COBIS TOPAS========="
                            + "\n1. Realizar transaccion"
                            + "\n2. Asiento contable"
                            + "\n3. Balance"
                            + "\n4. salir"
                            + "\nPorfavor digita una opcion: ");
                    opc = sc.nextInt();
                    
                    switch (opc) {
                        case 1:
                            asiento.transacciones();                            
                            break;
                        case 2:
                            asiento.asientoContable();
                            
                            break;
                        case 3:
                            asiento.balance();
                            
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    
                }while(opc != 4);
            
            
        } catch (Exception e) {
            System.out.println("Error, opcion no valida");
        }
     }
}
