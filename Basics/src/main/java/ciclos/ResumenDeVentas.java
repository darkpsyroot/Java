/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author francisco.reyes
 */
public class ResumenDeVentas {

    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0;
        float precioLitro, importeFactura, facturacionTotal = 0;

        for (int i = 0; i < 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el código del artículo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de litros"));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Digite el precio del litro"));

            importeFactura = (float) litros * precioLitro;//Importe por factura
            facturacionTotal += importeFactura;//Suma iterativa de las facturas
            if (codigo == 1) {
                litrosArticulo1 += litros;
            }
            if (importeFactura > 600) {
                conteoMas600++;
            }
        }
        System.out.println("Resumen de Ventas");
        System.out.println("Facturación total: " + facturacionTotal);
        System.out.println("Cantidad de litros vendidos del artículo 1: " + litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600: " + conteoMas600);

    }

}
