/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author francisco.reyes //debitoMxn = transaction .stream().mapToDouble(o ->
 * o.getImporte()).sum();
 */
public class Asiento {

    Scanner sc = new Scanner(System.in);
    ArrayList<Transaccion> transaccion = new ArrayList();
    Transaccion transaccionesContables;
    double importeDlsCredito, importeDlsDebito, 
            importeMxnCredito, importeMxnDebito;

    public void transacciones() {
        System.out.print("\nDivisa " + "\n1. Dolares" + "\n2. Pesos"
                + "\nPor favor digita una opcion: ");
        int moneda = sc.nextInt();

        System.out.print("\nCuenta " + "\n1. Credito" + "\n2. Debito"
                + "\nPor favor digita una opcion: ");
        int signo = sc.nextInt();

        System.out.print("\nImporte" + "\nPor favor digite el importe: ");
        float importe = sc.nextFloat();

        transaccionesContables = new Transaccion(moneda, signo, importe);

        transaccionesContables.setMoneda(moneda);
        transaccionesContables.setSigno(signo);
        transaccionesContables.setImporte(importe);

        transaccion.add(transaccionesContables);
    }

    public void asientoContable() {
        String string = "";
        System.out.println("\n\n\n");
        System.out.print("Divisa\t\tCuenta\t\tImporte" + "\n");
        for (int i = 0; i < transaccion.size(); i++) {
            if (transaccion.get(i).getMoneda() == 1 & transaccion.get(i).getMoneda() != 2) {
                string += "Dolares\t\t";
                if (transaccion.get(i).getSigno() == 1 & transaccion.get(i).getSigno() != 2) {
                    string += "Credito\t";
                    string += "\t" + transaccion.get(i).getImporte() + "\n";
                } else if (transaccion.get(i).getSigno() == 2 & transaccion.get(i).getSigno() != 1) {
                    string += "Debito\t";
                    string += "\t" + transaccion.get(i).getImporte() + "\n";
                }
            } else if (transaccion.get(i).getMoneda() == 2 & transaccion.get(i).getMoneda() != 1) {
                string += "Pesos\t\t";
                if (transaccion.get(i).getSigno() == 1 & transaccion.get(i).getSigno() != 2) {
                    string += "Credito\t";
                    string += "\t" + transaccion.get(i).getImporte() + "\n";

                } else if (transaccion.get(i).getSigno() == 2 & transaccion.get(i).getSigno() != 1) {
                    string += "Debito\t";
                    string += "\t" + transaccion.get(i).getImporte() + "\n";
                }
            }

        }

        System.out.println(string);
    }

    public void balance() {
        /*Dolares*/
             importeDlsCredito = transaccion.stream().filter(w -> w.getMoneda()== 1).filter(w -> w.getSigno()== 1).mapToDouble(w -> w.getImporte()).sum();

             importeDlsDebito = transaccion.stream().filter(w -> w.getMoneda()== 1).filter(w -> w.getSigno()== 2).mapToDouble(w -> w.getImporte()).sum();
             
             /*Pesos mexicanos*/

             importeMxnCredito = transaccion.stream().filter(w -> w.getMoneda()== 2).filter(w -> w.getSigno()== 1).mapToDouble(w -> w.getImporte()).sum();

             importeMxnDebito = transaccion.stream().filter(w -> w.getMoneda()== 2).filter(w -> w.getSigno()== 2).mapToDouble(w -> w.getImporte()).sum();

             
             System.out.println("\n\nBalance");
             System.out.println("\nImporte total Dolares");
             System.out.printf("Credito: %.2f\t",importeDlsCredito);
             System.out.printf("Debito: %.2f\t",importeDlsDebito);
             System.out.println("\n***********************************************");
             
             System.out.println("\n\nImporte total Pesos");
             System.out.printf("Credito: %.2f\t",importeMxnCredito);
             System.out.printf("Debito: %.2f\t",importeMxnDebito);
             System.out.println("\n***********************************************");
             
             System.out.println("\n\n\nComparativa cuentas de Credito");
             System.out.print("Pesos\t\tDolares\t\n");
             System.out.print(importeMxnCredito+"\t\t");
             System.out.print(importeDlsCredito);
             System.out.println("\n***********************************************");
             
             System.out.println("\n\n\nImporte pendiente Credito Pesos a Dolares");
             System.out.printf("Dolares: %.2f\t\t",(importeDlsCredito/0.054)*importeMxnCredito);
             
             System.out.println("\n\nImporte pendiente Credito Dolares a Pesos");
             System.out.printf("Pesos: %.2f\t\t",(importeMxnCredito/18.45)*(importeDlsCredito));
             System.out.println("\n***********************************************");
            
             
             
             System.out.println("\n\n\nImporte pendiente Debito Pesos a Dolares");
             System.out.printf("Dolares: %.2f\t\t",(importeDlsDebito/0.054)*importeMxnDebito);
             
             System.out.println("\n\nImporte pendiente Debito Dolares a Pesos");
             System.out.printf("Pesos: %.2f\t\t",(importeMxnDebito/18.45)*(importeDlsDebito));
             
             System.out.println("\n\n");
             

             
            
        }

  }

