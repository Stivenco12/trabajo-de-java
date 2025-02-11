package trabajo.com;
import java.util.Scanner;
public class Case2 {
    public static int case2() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("bienvenido a calculadora simple:");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. divicion");
            int numero1 ;
            int numero2 ;
            int numero3;
            int cal;
            cal = sc.nextInt();
            System.out.println("ingrese el primer numero");
            numero1 = sc.nextInt();
            System.out.println("ingrese el segundo numero");
            numero2 = sc.nextInt();
            switch (cal) {
                case 1:
                    numero3 = numero1 + numero2;
                    System.out.println("la suma de los numeros es = "+  numero3);
                    break;
                case 2:
                    numero3 = numero1 - numero2;
                    System.out.println("la resta de los numeros es = "+ numero3);
                    break;
                case 3:
                    numero3 = numero1 * numero2;
                    System.out.println("la multiplicacion de los numeros es = "+ numero3);
                    break;
                case 4:
                    numero3 = numero1 / numero2;
                    System.out.println("la division de los numeros es ="+ numero3);
                    break;
                default:
                    System.out.println("Caso elegido no exite");
            }
        return cal;
        }
    }
}