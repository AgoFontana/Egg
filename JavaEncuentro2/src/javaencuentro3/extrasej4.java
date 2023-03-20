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
public class extrasej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
        //y se muestre su equivalente en romano.
        Scanner leer= new  Scanner (System.in);
        System.out.println("ingrese un numero del 1 al 10 y devolvera su equivalente en numeros romanos");
        int num=leer.nextInt();
        
        if (num == 1) {
            System.out.println("I");    
        }
        if ( num==2) {
            System.out.println("II");
        }
        if ( num==3) {
            System.out.println("III");
        }
        if ( num==4) {
            System.out.println("IV");
        }
        if ( num==5) {
            System.out.println("V");
        }
        if ( num==6) {
            System.out.println("VI");
        }
        if ( num==7) {
            System.out.println("VII");
        }
        if ( num==8) {
            System.out.println("VIII");
        }
        if ( num==9) {
            System.out.println("IX");
        }
        if ( num==10) {
            System.out.println("X");
        }
        if (num<1 || num>10){
            System.out.println(" el numero esta fuera de rango");
    }
    
}
}