

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner lectura= new Scanner (System.in);
        
        System.out.println("Dame la base");
        double b1= lectura.nextDouble();
        
        System.out.println("Dame la altura");
        double a1 = lectura.nextDouble();
        
        double are= b1*a1;
        
        System.out.println("El area es " + are );
        
        lectura.close();
        
    }
}
    

