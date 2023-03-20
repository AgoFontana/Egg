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
public class extrasej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que lea números enteros. Si el número es múltiplo 
        de cinco debe detener la lectura y mostrar la cantidad de números leídos, la cantidad 
        de números pares y la cantidad de números impares. Al igual que en el ejercicio anterior
        los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
        Scanner leer=new Scanner(System.in);
        int num;
        int i=0;
        int P= 0;
        int I=0;
         do {
             System.out.println("ingrese un numero entero positivo");
             num=leer.nextInt();
             
             if (num % 2==0){
                 P++;
             }
             else{
                 I++;
             } 
             i++;
             } while (num % 5!= 0);
         
         System.out.println("la cantidad de numeros es: "+i+" la cantidad de numeros pares es: "+P+" la cantidad de numeros impares es: "+ I);
    }
    
}
