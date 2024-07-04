
import java.util.Scanner;


public class CalificacionAlumno
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa tu calificación");
        double cal = sc.nextDouble();
        
        if (cal>= 9 && cal <=10 )
        {
            System.out.println("A");
        }
        else if (cal>= 8 && cal< 9)
        {
            System.out.println("B");
        }
        else if (cal>= 7 && cal <8)
        {
            System.out.println("C");
        }
        else if (cal>= 6 && cal<7)
        {
            System.out.println("D");
        }
        else if (cal>= 0 && cal<6)
        {
            System.out.println("F");
        }
        else{
            System.out.println("Valor desconocido");
        }
        sc.close();
    }
}
