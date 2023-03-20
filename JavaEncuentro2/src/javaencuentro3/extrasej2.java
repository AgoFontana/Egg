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
public class extrasej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
      //  A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor 
        //   de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores 
          //  finales de cada variable. Utilizar sólo una variable auxiliar.
         
          int A=30;
          int B= 90;
          int C= 50;
          int D= 23;
          int aux;
          
          System.out.println("los valores iniciales de las variables son: "+ A+" "+B+" "+C+" "+D);
          aux=B;
          B= C;
          C= A;
          A= D;
          D= aux;
                System.out.println("los valores son " +B+" "+C+" "+A+" "+D);  
          
    }
    
}
