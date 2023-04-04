/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

/**
 *
 * @author francisco.reyes
 */
/*
 * La clase Transaccion, que modela una transacción contable dispone de los
 * métodos:
 *
 * int moneda() Devuelve la moneda de la transacción. Puede ser Const.DOLARES o
 * Const.PESOS
 *
 * int signo() Devuelve el signo de la transacción. Puede ser Const.DEBITO o
 * Const.CREDITO
 *
 * float importe() Devuelve el importe de la transacción
 */
public class Transaccion {
    /*Atributos*/
    private int moneda;
    private int signo;
    private float importe;
    
    private int montoInicial;
    
    //Constructor
    public Transaccion(int moneda, int signo, float importe) {
        this.moneda = moneda;
        this.signo = signo;
        this.importe = importe;
    }
    
    public void divisa(int divisa){
        if(divisa ==1){
            moneda *= 1;
            System.out.println("Dolares");
        }
        if(divisa ==2){
            moneda *=18.45;
            System.out.println("Pesos");
        }
            
    }
    
    //Getter and Setters
    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public int getSigno() {
        return signo;
    }

    public void setSigno(int signo) {
        this.signo = signo;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

}
