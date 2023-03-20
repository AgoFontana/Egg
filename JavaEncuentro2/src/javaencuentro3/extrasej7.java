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
public class extrasej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
         El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
        Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.*/
        
        Scanner leer= new Scanner (System.in);
        System.out.println("ingrese la cantidad de numeros");
        int n=leer.nextInt();
        int num;
        int suma=0;
        int i= 1;
        int maxi=0;
        int mini=0;
        double prom;
        int aux=0;
       
        /*System.out.println("ingrese un numeros entero");
        while (i<=n) {
         num=leer.nextInt();
        i++;
        suma=suma+num;
        if (num> maxi){
            maxi=num;
            mini=num;
        } if (num<mini) {
            mini=num;
        }
         
        }
        prom=suma/n;
        System.out.println("el valor maximo es: " +maxi+" el valor minimo es: "+mini+" el promedio es: "+ prom);*/
        
        do {
            System.out.println("ingrese un numeros entero");
            num=leer.nextInt();
            i++;
            suma=suma+num;
        if (num> maxi){
            maxi=num;
            mini=num;
        } if (num<mini) {
            mini=num;
        }
         }while (i<=n);
        
        prom=suma/n;
        System.out.println("el valor maximo es: " +maxi+" el valor minimo es: "+mini+" el promedio es: "+ prom);
        
        
    }
    
}
