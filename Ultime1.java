import java.util.Scanner;

public class Ultime1 {

    public static void main(String[] args) {
        
        Scanner lectura= new Scanner (System.in);
        
        System.out.println("Dame tu edad");
        int edad= lectura.nextInt();
        
        lectura.nextLine();
        
        System.out.println("Dame tu nombre");
        String nom = lectura.nextLine();
        
        System.out.println("Tu edad es " + edad + " y tu nombre es " +nom );
        
        lectura.close();
    }
    
    
}
