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
public class extrasej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero y devuelva el número de dígitos 
        que componen ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
        Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
        Nota: recordar que las variables de tipo entero truncan los números o resultados.*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero entero ");
        int num=sc.nextInt();
        int i=0;
        
        do {
            num= num/10;
            i++;       
            
        }while(num!=0);
        System.out.println("la cantidad de dijitos es "+i);
    }
    
}
