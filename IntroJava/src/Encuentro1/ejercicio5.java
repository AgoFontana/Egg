/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
        //el triple y la raíz cuadrada de ese número. 
       //Nota: investigar la función Math.sqrt().
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int num= leer.nextInt();
       int dobles, triple;
      
       dobles= num*2;
       triple=num*3;
      
       double raiz= Math.sqrt(num);
        System.out.println(" el doble del numero es " + dobles);
        System.out.println("el triple es " + triple);
        System.out.println("la raiz cuadrada es " +raiz);
       
    }
    
}
