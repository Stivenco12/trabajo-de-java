package trabajo.com;
import java.util.Scanner;
public class Case6 {
    public static int case6() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("horas estadas en el estacinamiento");
            int horas;
            int apagar;
            horas = sc.nextInt();
            apagar = 5 * horas;
            System.out.println("La tarifa por el estacionamiento es de = "+apagar);
            return horas;
        }
    }
}