package trabajo.com;
import java.util.Scanner;
public class Case9 {
    public static int case9() {
        try (Scanner sc = new Scanner(System.in)) {
            int estacion;
            System.out.println("ingrese en numero el mes que deseas determinar la estacion del año");
            System.out.println("1: enero\n 2: febrero \n 3: marzo \n 4: abril \n 5: mayo \n 6: junio \n 7: julio \n 8: agosto \n 9: septiembre \n 10: octubre \n 11: novimbre \n 12: diciembre");
            estacion = sc.nextInt();
            if (estacion >= 3 && estacion <= 5) {
                System.out.println("el mes que elegistes esta en la primavera");
            }else if (estacion >=6 && estacion <= 8) {
                System.out.println("el mes que elegistes esta en verano");
            }else if( estacion >=9 && estacion <= 11){
                System.out.println("el mes que elegistes esta en otoño");
            }else if (estacion == 12) {
                System.out.println("el mes que elegistes esta en invierno");
            }else if(estacion >= 1 && estacion <= 2){
                System.out.println("el mes que elegistes esta en invierno");
            }else{
                System.out.println("el mes que elegiste no exite");
            }
            return estacion;
        }
    }
}