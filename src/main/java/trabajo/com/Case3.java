package trabajo.com;
import java.util.Scanner;
public class Case3 {
    public static int case3() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("cual es la nota del estudiatne = ");
            int nota;
            nota = sc.nextInt();
            if (nota >= 90 && nota < 100) {
                System.out.println("la nota del estudiante es = A");
            }else if(nota >= 80 && nota < 89){
                System.out.println("la nota del estudiante es = B");
            }else if(nota >=70 && nota < 79){
                System.out.println("la nota del estudiante es = C");
            }else if(nota >= 60 && nota < 69){
                System.out.println("la nota del estudiante es = D");
            }else if(nota <=  60){
                System.out.println("la nota del estudiante es = F");
            }
        return nota;
        }
    }
}