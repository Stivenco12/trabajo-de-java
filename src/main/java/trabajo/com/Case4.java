package trabajo.com;
import java.util.Scanner;
public class Case4 {
    public static int case4() {
        try (Scanner sc = new Scanner(System.in)) {
            int lado1;
            int lado2;
            int lado3;
            System.out.println("Ingrese los datos del triangulos");
            System.out.println("ingrese el lado 1 = ");    
            lado1 = sc.nextInt();
            System.out.println("ingrese el lado 2 = ");
            lado2 = sc.nextInt();
            System.out.println("ingrese el lado 3 = ");
            lado3 = sc.nextInt();
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triangulo es Equilátero");
            }else if(lado1 == lado2 && lado1 != lado3){
                System.out.println("El triangulo es Isósceles");
            }else if (lado2 == lado3 && lado2 != lado1) {
                System.out.println("El triangulo es Isósceles");
            }else if (lado3 == lado1 && lado3 != lado2) {
                System.out.println("El triangulo es Isósceles");
            }else{
                System.out.println("El triangulo es Escaleno");
            }
        return lado1;
        }
    }
}