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
public class ejercico14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
        Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos para averiguar 
        la media de los hijos de todas las familias.*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de familias");
        double familia=sc.nextDouble();
        double suma=0;
        for (int i = 1; i < (familia+1); i++) {
        System.out.println("ingrese la cantidad de hijos de la familia numero "+i);
        double hijos=sc.nextDouble();
        suma=suma+hijos;
        
        }
        double media=(suma/familia);
        
        System.out.println("la media de hijos es: "+media);
        
        
    }
    
}
