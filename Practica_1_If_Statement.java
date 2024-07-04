
package practica_1_if_statement;

import java.util.Scanner;
  
/**

Programa para saber si un numero es par o impar
Alexander Medina Dominguez
Fundamentos de Programación Martes y Jueves

*/

public class Practica_1_If_Statement {

    
    public static void main(String[] args) {
        
        Scanner soul = new Scanner (System.in);
        
        System.out.println("Hola, ingresa un numero entero");
        int n1 = soul.nextInt();
        
        soul.close();
        
        int n2= n1%2;
       
        if (n2==0) {
            System.out.println("El numero " + n1 + " SI es un numero par");
        }
        else {
            System.out.println("El numero " +n1+ " NO es un numero par, asi que es impar");
        }
    } 
}

