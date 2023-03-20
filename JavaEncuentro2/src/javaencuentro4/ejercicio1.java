/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaencuentro4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
         restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática 
        y deben devolver sus resultados para imprimirlos en el main. */
        
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        int num3;
        String exit= "N";
        int suma= (num1+num2);
        int resta= (num1-num2);
        int multi=(num1*num2);
        int div=(num1/num2);
        do {
        System.out.println("elija una opcion de menu");
        System.out.println(" A SUAMAR");
        System.out.println(" B RESTAR");
        System.out.println(" C MULTIPLICAR");
        System.out.println(" D DIVIDIR");
        String opcion= leer.next();
        int resultado;
        Suma( num1,  num2);
        Resta(num1,num2);
        Multiplicacion(num1, num2);
        Division( num1, num2);
        
        switch (opcion) {
            case "A":
                        System.out.println("la suma de los valores es: "+ suma);
            break;
            case "B":
                        System.out.println("la resta de los valores es: " +resta);
            break;
            case "C":
                        System.out.println("la multiplicacion de los valores es: " +multi);
            break;
            case "D":
                        System.out.println("la division de los valores es: " + div);
            break;            
            case "E":
                        System.out.println("esta seguro que desea salir? S/N");
                        exit= leer.next();
            break;
        }
        } while (!exit.equals("S")); 
                
    }
    public static int Suma(int num1, int num2){
        int resultado= num1+num2;
      return (resultado);
    }
      public static int Resta(int num1, int num2){
        int resultado= num1-num2;
      return (resultado);
      }
       public static int Multiplicacion(int num1, int num2){
        int resultado= num1*num2;
      return (resultado);
       }
        public static int Division(int num1, int num2){
        int resultado= num1/num2;
      return (resultado);
        }
}
