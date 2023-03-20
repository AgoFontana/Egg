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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
        //Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int n=leer.nextInt();
        int i;
        int j;
        
        for (i=0; i<n; i++){
            for (j=0; i<n; j++) {
                if (i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                            }
                
            }
            System.out.print("  ");
        }
    }
    
}
