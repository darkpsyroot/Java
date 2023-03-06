
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Busqueda;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.reyes
 */
public class Binaria {
    
    public static void main(String[] args) {
        int arreglo[] = {1,2,3,4,5};
        int dato, inf, sup, mitad, i;
        boolean band = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("digita el numero a buscar"));
        
        inf = 0;
        sup = 5;
        i = 0;
        
        mitad =(inf+sup/2);
        while(inf<=sup && i < 5){
            if(arreglo[mitad] ==dato){
                band = true;
                break;
            }
            if(arreglo[mitad] > dato){
                sup = mitad;
                mitad = (inf+sup)/ 2;
            }
            if(arreglo[mitad] < dato){
                sup = mitad;
                mitad = (inf+sup)/ 2;
            }
            i++;
        }
        if(band == true){
            JOptionPane.showMessageDialog(null,"numero encontrado en la poscicion " + mitad);
        }else{
            JOptionPane.showMessageDialog(null,"no hemos encontrado el nuemro en el arreglo");
        }
    }
    
}
