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
public class extrasej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
        realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: 
        Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, 
        y el número de restas realizadas es el cociente.
        Por ejemplo: 50 / 13:
        50 – 13 = 37     una resta realizada
        37 – 13 = 24     dos restas realizadas
        24 – 13 = 11     tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
        
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el dividendo y luego el divisor");
        int dividendo=leer.nextInt();
        int divisor=leer.nextInt();
        
       
        int resto = dividendo;
  
        int cociente=0;
     
        do {
               resto= resto-divisor;
                cociente++;
            }while (resto>=divisor);
       
        
            System.out.println("el dividendo es "+dividendo+" el divisor es "+divisor+" el cociente es "+cociente+ " el resto es "+resto);
            
        
        
        

    }
    
}
