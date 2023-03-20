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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escriba un programa en el cual se ingrese un valor límite positivo, y a 
        //continuación solicite números al usuario hasta que la suma de los números introducidos supere 
        //el límite inicial.
        
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un numero entero positivo limite");
        int numL=leer.nextInt();
        int suma=0;
       
        do {
        System.out.println("ingrese un numero entero positivo");
        int num=leer.nextInt();
        suma=suma+num;    }
        while (suma<=numL);
        
      }
}