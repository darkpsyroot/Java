/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.reyes
 */
public class ExcepcionesNoVerificadas {
    
    public void operaciones(){
        int num1=5, num2 = 0;
        
        int resultado = num1/num2;
        
        System.out.println(resultado);
    }
    
    public void operaciones2(){
        try{
            operaciones();
        }catch(ArithmeticException a){
            JOptionPane.showMessageDialog(null,"Error, se ha intentado dividir un muero entre 0");
        }
        System.out.println("Programa terminado");
    }
    
    public static void main(String[] args) {
        ExcepcionesNoVerificadas nv = new ExcepcionesNoVerificadas();
        
        nv.operaciones2();
    }
    
}
