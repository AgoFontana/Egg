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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla 
        //el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
        //por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
        //Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
        //se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
        //Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
        
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese dos numeros entero positivo limite");
        int num1 =leer.nextInt();
        int num2= leer.nextInt();
        String exit= "N";
        int suma= (num1+num2);
        int resta= (num1-num2);
        int multi=(num1*num2);
        int div=(num1/num2);
        
        
        do {
            System.out.println("eliga una opcion del menu");
            System.out.println("1 SUMA");
            System.out.println("2 RESTA");
            System.out.println("3 MULTIPLICACION");
            System.out.println("4 DIVISION");
            System.out.println("5 SALIR");
         int opcion= leer.nextInt();
        switch (opcion){
            case 1: 
                   System.out.println("la suma de los numero es " + suma);
                break; 
            case 2:
                 System.out.println("la resta es " + resta);
                break;
            case 3:
                System.out.println("la multiplicacion es " + multi);
                break;
            case 4:
                System.out.println("la division es "+ div);
                break;
            case 5:
                System.out.println("esta seguro que desea salir? S/N");
                exit= leer.next();
                break;   
            default:
                    System.out.println("no se encuentra esa opcion");
                    
        }
        }
        while (!exit.equals("S"));
    }
    
}
