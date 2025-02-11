package trabajo.com;
import java.util.Scanner;
public class Case5 {
    public static Double case5() {
        try (Scanner sc = new Scanner(System.in)) {
            Double precio;
            String tipo_cliente;
            Double resultado;
            Double resultado2;
            System.out.println("Ingrese el precio del producto:");
            precio = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese el tipo de cliente (A/B/C):");
            tipo_cliente = sc.nextLine().toUpperCase();
            if (tipo_cliente.equals("A")) {
                resultado = precio * 0.30;
                resultado2 = precio - resultado;
                System.out.println("El precio final con descuento es: "+resultado2);
            }else if(tipo_cliente.equals("B")){
                resultado = precio * 0.20;
                resultado2 = precio - resultado;
                System.out.println("El precio final con descuento es: "+resultado2);
            }else if(tipo_cliente.equals("C")){
                resultado = precio * 0.10;
                resultado2 = precio - resultado;
                System.out.println("El precio final con descuento es: "+resultado2);
            }
            return precio;
        }
    }
}