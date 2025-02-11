package trabajo.com;
import java.util.Scanner;
public class Case7 {
    public static int case7() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1: De Celsius a Fahrenheit");
            System.out.println("2: De Fahrenheit a Celsius");
            int he;
            he = sc.nextInt();
            switch (he) {
                case 1:
                    int celsius;
                    int resul;
                    System.out.println("ingrese los grados celcius que quiere convertir a fahrenheit = ");
                    celsius = sc.nextInt();
                    resul = (celsius * 9/5) + 32;
                    System.out.println("Datos convertidos = "+resul);
                    break;
                case 2:
                    int fahrenheit;
                    int resul2;
                    System.out.println("ingrese los datos que quiere convertir a celcios = ");
                    fahrenheit = sc.nextInt();
                    resul2 = (fahrenheit - 32 ) * 5/9;
                    System.out.println("Datos convertidos = "+resul2);
                    break;
                default:
                    System.out.println("Caso elegido no exite");  
                    break;
            }
    return he;
        }
    }
}