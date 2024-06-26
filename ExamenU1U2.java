
package examenu1u2;

import java.util.Scanner;

public class ExamenU1U2 {

    public static void main(String[] args) {
    
        Scanner leer= new Scanner (System.in);
        
        System.out.println("Ingresa el nombre del videojuego 1");
        String n1= leer.nextLine();
        
        System.out.println("Ingresa el precio del videojuego 1");
        double p1= leer.nextDouble();
        
        leer.nextLine();
        
        System.out.println("Ingresa el nombre del videojuego 2");
        String n2= leer.nextLine();

        System.out.println("Ingresa el precio del videojuego 2");
        double p2= leer.nextDouble();
        
        leer.nextLine();
        
        System.out.println("Ingresa el nombre del videojuego 3");
        String n3= leer.nextLine();

        System.out.println("Ingresa el precio del videojuego 3");
        double p3= leer.nextDouble();        
        
        leer.nextLine();
        
        double pt1= p1-(p1*.30);
        double pt2= p2-(p2*.65);
        double pt3= p3-(p3*.15);
        
        leer.close();
        
        System.out.println("El precio total del video juego 1 es: " +pt1);
        System.out.println("El precio total del video juego 2 es: " +pt2);
        System.out.println("El precio total del video juego 3 es: " +pt3);
        
    }
    
}
