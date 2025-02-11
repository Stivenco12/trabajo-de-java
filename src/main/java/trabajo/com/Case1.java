package trabajo.com;
import java.util.Scanner;
public class Case1 {
    public static int case1() {
        try (Scanner sc = new Scanner(System.in)) {
            int persona;
            System.out.println("ingrese la edad de la persona = ");
            persona = sc.nextInt();
            if (persona >= 0 && persona < 12) {
                System.out.println("la persona es un niño de = " + persona + " años");
            } else {
                if (persona >= 13 && persona < 17) {
                    System.out.println("la persona es adolecente de " + persona + " años");
                } else {
                    if (persona >= 18 && persona < 59) {
                        System.out.println("la persona es un adulto de " + persona + " años");
                    } else if (persona >= 60) {
                        System.out.println("la persona es un adulto mayor de " + persona + " años");
                    }
                }
            }
            return persona; 
        }
    }
}

