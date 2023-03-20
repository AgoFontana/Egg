/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaencuentro4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las 
        personas ingresadas por teclado e indique si son mayores o menores de edad. 
        Después de cada persona, el programa 
        debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando
        el usuario ingrese la palabra “No”.*/
        
        Scanner leer= new Scanner(System.in);
        String opcion;
        int edad;
        
        do {
        Devolucion ();
        System.out.println("desea seguir? S/N");
        opcion=leer.next();
        } while(!opcion.equals("n"));
        
        
     }
    public static void Devolucion (){
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre=leer.next();
        System.out.println("ingrese su edad");
        int edad=leer.nextInt();
          if(edad>= 18){
            System.out.println("usted es mayor de edad");    
        } else{
            System.out.println("usted es menor de edad");
        }
    
    }
    
}
