/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaencuentro3;

/**
 *
 * @author Usuario
 */
public class extrasej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
        del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
        0-0-0
        0-0-1
        0-0-2
        0-0-E
        0-0-4
        0-1-2
        0-1-E
        Nota: investigar función equals() y como convertir números a String.*/
        
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                for (int k = 0; k < 10; k++) {
                   
                    String numI= String.valueOf(i);
                    String numJ= String.valueOf(j);
                    String numK= String.valueOf(k);
                    if (numI.equals("3")){
                        numI="E";
                    }
                     if (numJ.equals("3")){
                        numJ="E";
                    }
                    if (numK.equals("3")){
                        numK="E";
                    }
                    System.out.println(numI+"-"+numJ+"-"+numK);
                
            }
            
        }
           
    }
    
}}
