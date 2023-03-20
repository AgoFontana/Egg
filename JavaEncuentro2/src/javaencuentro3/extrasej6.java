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
public class extrasej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
        //y el promedio de estaturas en general.
        
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese la cantidad de personas");
        int num= leer.nextInt();
        int i= 0;
       int k=0;
        double altura;
        double sumaA=0;
        double sumaB=0;
             
        
        do {
            System.out.println("ingrese la altura de la persona numero " + i);
            altura=leer.nextDouble();
            if (altura < 1.60) {
            i++;
            k++;
            
            sumaA=sumaA+altura;
        }
            else {
                sumaB=sumaB+altura;
                i++;
            }
        }while (i!=num);
        
         double promA= sumaA/k;
        double promB=  ((sumaB+sumaA)/(num));
        System.out.println("el promedio de personas por debajo de 1,6 es " + promA);
            System.out.println("el promedio de personas en total es " +promB);
    
        }
        }
