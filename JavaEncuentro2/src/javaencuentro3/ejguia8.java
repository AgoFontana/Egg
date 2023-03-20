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
public class ejguia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
        //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá 
        //de nuevo hasta que la nota sea correcta.
       	Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una nota del 1 al 10");
        int nota=leer.nextInt();
    
    	while (nota>0 && nota<=10){

    	System.out.println("la nota es correcta");
        break;
    	} 
        while (nota<0 || nota>10){
    	
            System.out.println("ingrese nuevamente la nota");
            nota=leer.nextInt();
    }   
        System.out.println("la nota es correcta"); 
        
    }
              
    }

