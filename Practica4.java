
package practica4;

import java.util.Scanner;

public class Practica4 {

    
    public static void main(String[] args) {
        
        Scanner lectura= new Scanner (System.in);
        
        System.out.println ("Dime cantidad en pesos mexicanos: ");
        double money= lectura.nextDouble();
        double dolar= 17.13;
        double euro= 18.26;
        
        double d2 = money / dolar;
        double e2 = money/ euro;
        
        System.out.println ("Ingresaste la cantidad de " +money + " pesos mexicanos");
        System.out.println ("Tu cantidad corresponde a " +d2+ " en dolares, y a " +e2+ "en euros");
        System.out.println ("Vuelva pronto tqm");
        
        lectura.close ();
        
    }
    
}
