/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaencuentro3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extrasej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.*/
        
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese la categoria de su obra social A,B o C");
        String cate= leer.next();
        System.out.println("ingrese el monto del tratamiento");
        int costo= leer.nextInt();
        int precio;
        
        if (cate.equals("A")) {
           precio = costo-((costo*50)/100);
            System.out.println("el costo del tratamiento con el descuento es "+ precio);
        }
          if (cate.equals("B")) {
           precio = costo-((costo*35)/100);
            System.out.println("el costo del tratamiento con el descuento es "+ precio);
          }
            if (cate.equals("C")) {
           precio = costo;
            System.out.println("el costo del tratamiento no incluye descuento es "+ precio);
            }
    }
    
}
