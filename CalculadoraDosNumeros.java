
import java.util.Scanner;

public class CalculadoraDosNumeros
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opc;

        do
        {
            System.out.println("***Calculadora***");
            System.out.println("1. Sumar los dos numeros");
            System.out.println("2. Multiplicar los dos numeros");
            System.out.println("3. Restar los dos numeros");
            System.out.println("4. Dividir los dos numeros");
            System.out.println("5. Salir");
            opc = sc.nextInt();

            switch (opc)
            {
                case 1:
                    System.out.println("Ingresa el numero 1");
                    int num1Suma = sc.nextInt();
                    System.out.println("Ingresa el numero 2");
                    int num2Suma = sc.nextInt();
                    int resSuma = num1Suma + num2Suma;
                    System.out.println("El resultado de la suma es = " + resSuma);
                    break;

                case 2:
                    System.out.println("Ingresa el numero 1");
                    int num1Mult = sc.nextInt();
                    System.out.println("Ingresa el numero 2");
                    int num2Mult = sc.nextInt();
                    int resMult = num1Mult * num2Mult;
                    System.out.println("El resultado de la multiplicacion es = " + resMult);
                    break;

                case 3:
                    System.out.println("Ingresa el numero 1");
                    int num1Res = sc.nextInt();
                    System.out.println("Ingresa el numero 2");
                    int num2Res = sc.nextInt();
                    int resRes = num1Res - num2Res;
                    System.out.println("El resultado de la resta es = " + resRes);
                    break;

                case 4:
                    System.out.println("Ingresa el numero 1");
                    int num1Div = sc.nextInt();
                    System.out.println("Ingresa el numero 2");
                    int num2Div = sc.nextInt();
                    if (num2Div != 0)
                    {
                        int resDiv = num1Div / num2Div;
                        System.out.println("El resultado de la division es = " + resDiv);
                    } else
                    {
                        System.out.println("Error: Division por cero no permitida.");
                    }
                    break;

                case 5:
                    System.out.println("Vuelva pronto....");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opc != 5);

        sc.close();
    }
}
