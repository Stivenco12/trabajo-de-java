package trabajo.com;
import java.util.Scanner;
public class Case8 {
    public static int case8() {
        try (Scanner sc = new Scanner(System.in)) {
            int entero;
            System.out.println("ingrese un numero entero = ");
            entero = sc.nextInt();
            if (entero % 2 == 0) {
                System.out.println("es un numero es par");
            }else{
                System.out.println("no es un numero par");
            }
            return entero;
        }
    }
}