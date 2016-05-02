/*
 25/04/2016
Ingridt Rodríguez
Laboratorio N°1         Problema 2

 */
package pract2lab_giank2504;

import java.util.Scanner;

public class Pract2Lab_giank2504 {

    public static void main(String[] args) {
    double precio, p_imp, preciof;
    final double imp=0.07;
        
    Scanner en = new Scanner(System.in);
    
    System.out.print("Introduzca el precio del producto: ");
    precio=en.nextFloat();
    
    preciof=precio*imp;
    p_imp= (precio+ preciof);
    
    System.out.print("El precio con impuesto del 7% es de: "+p_imp);
    
    }
    
}
