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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
        por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
        Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, 
        ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/
          
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese un  numero");
        int num=sc.nextInt();
        Primos(num);
        
    }
   // public static boolean Primos(int num){
    /*    boolean resultado= true;
        if ((num % 2 == 0) && (num % 3 == 0)){
            resultado=false;
                System.out.println(resultado);  
        }else{
            resultado=true;
                        System.out.println(resultado);
                        }
           return (resultado);     
        }*/
    
   //}
public static boolean Primos(int num){
    boolean resultado;
    int c=0;
    for (int i = 1; i < num; i++) {
        if (num % i==0){
            c++;
        }
        
    } 
    if (c==1){
        resultado=true;
        System.out.println(resultado);
        
    }else{
        resultado=false;
        System.out.println(resultado);
    } 
    return resultado;
 
    
}
}
