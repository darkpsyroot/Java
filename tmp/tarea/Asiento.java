/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author francisco.reyes
 */
public class Asiento {

    Scanner sc = new Scanner(System.in);
    ArrayList<Transaccion> listTransaccion = new ArrayList();

    //metodo para ingresar valores al atributo listTransaccion
    public void addTransacciones() {
        //Obtener valores ingresados 
        System.out.print("\nDivisa "
                + "\n1. Dolares"
                + "\n2. Pesos"
                + "\nPor favor digita una opcion:");
        int moneda = sc.nextInt();

        System.out.print("\nCuenta "
                + "\n1. Credito"
                + "\n2. Debito"
                + "\nPor favor digita una opcion:");
        int signo = sc.nextInt();

        System.out.print("\nImporte"
                + "\nPor favor digite el importe: ");
        float importe = sc.nextFloat();

        //Instanciamos la clase transaccion
        Transaccion trans = new Transaccion(moneda, signo, importe);

        //Llenamos el array con el metodo set de la clase Transacción
        trans.setMoneda(moneda);
        trans.setSigno(signo);
        trans.setImporte(importe);

        //Llenamos la lista
        listTransaccion.add(trans);
    }

    //metodo para mostrar onformación de esa lista
    public void getTransaccion() {
        //Para poder sacar todos los valores de la lista
        //hacemos un recorrido
        //valiable cadena para almacenar los datos recorridos
        System.out.println("\n\n");
        System.out.println("Divisa   Cuenta   Importe  ");
        String string = "";
        for (int i = 0; i < listTransaccion.size(); i++) {
            if(listTransaccion.get(i).getMoneda() == 1){
                listTransaccion.get(i).getMoneda();
                string += "Dolares";
            }else{
                string += "Pesos";
            }
            
            if(listTransaccion.get(i).getSigno() == 1){
                listTransaccion.get(i).getSigno();
                string += "  Credito";
            }else{
                listTransaccion.get(i).getSigno();
                string += "  Debito";
            }
            string +="  "+listTransaccion.get(i).getImporte()+"\n";

        }

        System.out.println(string);
        //concatenamos lo que tiene la lista
    }
    
    public void addBalance() {
        for (Transaccion balance : listTransaccion) {
            System.out.println(balance);
        }
    }

}
