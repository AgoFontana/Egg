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
public class extrasej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado un tiempo en minutos, calcular su equivalente en días y horas. 
        //Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 
        //1 día, 2 horas.
        Scanner leer= new Scanner (System.in);
        System.out.println("ingrese los minutos que desea calcular");
        int min=leer.nextInt();
        
        int horas= min/60;
        int dias= min/1440;
        
        System.out.println("los minutos ingresados equivalen a " + dias + " dias "+ horas + " horas ");
        
    }
    
}
