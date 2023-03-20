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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida 
        por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
        la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor 
        y mostrará un mensaje indicando el cambio (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €*/
        
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros a convertir");
        double euros=leer.nextDouble();
        Cambio (euros);
        
    }
    public static void Cambio (double euros){
        double yenes= 129.852*euros;
        double libras=0.86*euros;
        double dolar=1.28611*euros;
        System.out.println("el cambio es: "+yenes+" yenes, "+libras+" libras, "+dolar+" y dolares ");
        
    }
}
