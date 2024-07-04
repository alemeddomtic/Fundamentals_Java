
//Fundamentos de Programación

//Unidad 3

//Alexander Medina Dominguez

package pra3_fibonacci;

import java.util.Scanner;

public class Pra3_Fibonacci {

    public static void main(String[] args) {
        
        System.out.println("Hola bienvenido :)");  
        
        Scanner coca = new Scanner (System.in);
        System.out.println("Ingresa la cantidad de numeros que quieres visualizar");
        int n1 = coca.nextInt();
        int a1 =0; 
        int b1 =1;
        int c1;
        
    for (int i = 0; i < n1; i++){
        c1 = a1;
        a1 = b1 + a1;
        b1 = c1;
        
        System.out.println("Serie Fibonacci: " + b1);
        
      }
   
    coca.close();
    
    } 
}