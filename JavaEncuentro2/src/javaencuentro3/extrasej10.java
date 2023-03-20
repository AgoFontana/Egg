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
public class extrasej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
        dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta 
        es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta 
        nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.*/
        
        Scanner leer= new Scanner(System.in);
        
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        int num= num1*num2;
        System.out.println(num1+" * "+num2);
        System.out.println("adivine la respuesta de la multiplicacion");
        int num3=leer.nextInt();
        
        if (num==num3){
                System.out.println("la respuesta es CORRECTA");
            }else
        do {
             System.out.println("la respuesta en INCORRECTA, vuelva a intentarlo");
             num3=leer.nextInt();
            } while (num!=num3);
          System.out.println("la respuesta es CORRECTA");
        
       
        
    }
    
}
