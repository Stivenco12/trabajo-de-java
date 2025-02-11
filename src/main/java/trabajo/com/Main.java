package trabajo.com;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {    
    System.out.println("1: Clasificación de edades");
    System.out.println("2: Calculadora simple");
    System.out.println("3: Simulador de notas");
    System.out.println("4: Clasificación de triángulos");
    System.out.println("5: Calculadora de descuentos");
    System.out.println("6: Calculadora de tarifas de estacionamiento");
    System.out.println("7: Conversor de temperatura");
    System.out.println("8: Cálculo de números pares e impares");
    System.out.println("9: Determinador de estación del año");
    System.out.println("10: Sistema de recomendaciones de comida (no Funcionar reparar)"); //reparar
    System.out.println("11: Conversor de unidades");
    System.out.println("12: Clasificación de años");
    System.out.println("13: Conversor de monedas");
    System.out.println("14: Calculador de IMC");
    System.out.println("15: Juego de piedra, papel o tijera");
    System.out.println("16: Clasificación de números según divisibilidad");
    System.out.println("17: Clasificación por niveles de velocidad");
    System.out.println("18: Determinación de rango etario");
    System.out.println("20: Identificación del trimestre");
    System.out.println("21: Clasificación de figuras geométricas");
    System.out.println("22: Evaluación de signos del zodiaco");
    System.out.println("23: Conversor de edades caninas");
    System.out.println("24: Clasificación por índice de contaminación");
    int menu;
    menu = sc.nextInt();
    switch (menu) { 
        case 1:
            Case1.case1();
            break;
        case 2:
            Case2.case2();
            break;
        case 3:
            Case3.case3();
            break;
        case 4:
            Case4.case4();
            break;
        case 5:
            Case5.case5();
            break;
        case 6:
            Case6.case6();
            break;
        case 7:
            Case7.case7();
            break;
        case 8:
            Case8.case8();
            break;
        case 9:
            Case9.case9();
            break;
        case 10:
            System.out.println("no funciona ........ ");
            String clima;

            System.out.println("climas del dia soleado, lluvioso, frio");
            sc.next();
            clima = sc.nextLine();
            System.out.println(clima.matches("soleado(.*)"));
            break;
        case 11:
            int din;
            System.out.println("1. Conversor de km a millas \n2. conversor de Celsius a Fahrenheit \n3. conversor de kilogramos a libras");
            din = sc.nextInt();
            switch (din) {
                case 1:
                    System.out.println("Ingresa los km");
                    double km ;
                    km = sc.nextDouble();
                    double resudo;
                    resudo = km * 0.621371;
                    System.out.println("los km pasados a millas es igual a "+resudo);
                    break;
                case 2:
                    int celsius1;
                    int resul1;
                    System.out.println("ingrese los grados celcius que quiere convertir a fahrenheit = ");
                    celsius1 = sc.nextInt();
                    resul1 = (celsius1 * 9/5) + 32;
                    System.out.println("Datos convertidos = "+resul1);
                    break;
                case 3:
                    System.out.println("ingrese los kg");
                    double kg;
                    kg = sc.nextDouble();
                    double resud;
                    resud = kg * 2.20462;
                    System.out.println("los kg pasados a libras es igual a "+resud);
                    break;
                default:
                    System.out.println("Caso elegido no exite");   
                    break;
            }
            break;
        case 12:
            System.out.println("Ingrese un año =");
            int año;
            año = sc.nextInt();
            if (año % 4 == 0 && año % 100 != 0) {
                System.out.println("el año "+año+" es bisiesto");
            }else{
                System.out.println("el año "+año+" es comun");
            }
            break;
        case 13:
            System.out.println("ingrea a que moneda quiere hacer el cambio \n 1. Euros \n 2. pesos colombianos \n 3. yenes");
            int a;
            double dolares;
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("ingrese los dolares que quiere cambiar");
                    dolares = sc.nextInt();
                    double re;
                    re = dolares * 0.96;
                    System.out.println("los "+dolares+" dolares han pasado hacer "+re+" euros");
                    break;
                case 2:
                    System.out.println("ingrese los dolares que quiere cambiar");
                    dolares = sc.nextInt();
                    double re2;
                    re2 = dolares * 4238;
                    System.out.println("los "+dolares+" dolares han pasado hacer "+re2+" pesos colombianos");
                    break; 
                case 3:
                    System.out.println("ingrese los dolares que quiere cambiar");
                    dolares = sc.nextInt();
                    double re3;
                    re3 = dolares * 155.77;
                    System.out.println("los "+dolares+" dolares han pasado hacer "+re3+" yenes");
                    break;
                default:
                    System.out.println("Caso elegido no exite");  
                    break;
                }
            break;
        case 14:
            double peso;
            double altura;
            double IMC;
            System.out.println("bienvenido al calculador de IMC \npor favor ingrese los siguentes datos, peso(kg),estatura(cm)");
            System.out.println("ingrese su peso =");
            peso = sc.nextDouble();
            System.out.println("por favor ingrese su estatura");
            altura = sc.nextDouble()/100;
            IMC = peso / (Math.pow(altura, 2));
            System.out.println("su es IMC es de = "+IMC);
            if (IMC < 18.5 ) {
                System.out.println("La persona tiene un bajo peso");
            }else if(IMC <= 24.9 && IMC >= 18.5){
                System.out.println("la persona tiene un peso normal");
            }else if(IMC <= 29.9 && IMC >= 25){
                System.out.println("la persona tiene sobrepeso");
            }else if (IMC >= 30) {
                System.out.println("la persona tiene sobre peso");
            }else{
                System.out.println("lo sentimos hubo un error");
            }
            break;
        case 15:
            String jugador1;
            String jugador2;
            String a1 = "PIEDRA";
            String a2 = "TIJERA";
            String a3 = "PAPEL";
            System.out.println("juego de piedra, papel o tijera");
            System.out.println("Jugador 1 = ");
            sc.nextLine();
            jugador1 = sc.nextLine().toUpperCase();
            System.out.println("jugador 2 = ");
            jugador2 = sc.nextLine().toUpperCase();
            System.out.println(jugador1);
            System.out.println(jugador2);
            if (jugador1.equals(a1) && jugador2.equals(a2)) {
                System.out.println("player two game over \nWin player one");
            }else if(jugador1.equals(a2) && jugador2.equals(a3)){
                System.out.println("player two game over\nWin player one");
            }else if (jugador1.equals(a3) && jugador2.equals(a1)) {
                System.out.println("player two game over \nWin player one");
            }else if (jugador2.equals(a1) && jugador1.equals(a2) ) {
                System.out.println("plater one game over\nwin player two");
            }else if (jugador2.equals(a2) && jugador1.equals(a3)) {
                System.out.println("plater one gamer over\nwin plater two");
            }else if (jugador2.equals(a3) && jugador1.equals(a1)) {
                System.out.println("player one game over \n win player two");
            }else{
                System.out.println("mistake");
            }
            break;
        case 16:
            int number;
            System.out.println("clasificacion de numeros = ");
            System.out.println("ingrese su numero entero");
            number = sc.nextInt();
            if (number % 2 == 0 && number % 3 == 0) {
                System.out.println("el numero "+number+" es divisiblen en 2 y en 3");
            }else if (number % 2 == 0 && number % 3 != 0) {
                System.out.println("el numero "+number+" es divisible nada mas en 2");
            }else if (number % 2 != 0 && number % 3 == 0) {
                System.out.println("el numero "+number+" es divisible nada mas en 3");
            }else{
                System.out.println("el numero "+number+" no es divisible ni en 2 ni 3");
            }
            break;
        case 17:
            int vehiculo;
            System.out.println("bienvenido");
            System.out.println("ingrese la velocidad a la que iba el vehiculo");
            vehiculo = sc.nextInt();
            if (vehiculo >= 0 && vehiculo <= 20) {
                System.out.println("el vehiculo va muy lento");
            }else if (vehiculo >= 21 && vehiculo <= 60) {
                System.out.println("el vehiculo hiba a una velocidad moderada");
            }else if (vehiculo >= 61 && vehiculo <= 120) {
                System.out.println("el vehiculo iba una velocidad rapida");
            }else if (vehiculo >= 120) {
                System.out.println("el vehiculo va muy rapido");
            }else{
                System.out.println("el vehiculo esta retrocediendo(wtf quien pone negativos), si aparece esto significa que hubo un mistake informar a jedier");
            }
            break;
        case 18:
            int age;
            System.out.println("bienvenido");
            System.out.println("por favor regale me su edad");
            age = sc.nextInt();
            if (age >= 0 && age <= 2) {
                System.out.println("la edad ingresa es la de un bb");
            }else if (age >= 3 && age <= 12) {
                System.out.println("la edad es la de un niño");
            }else if (age >= 13 && age <= 17) {
                System.out.println("la edad es la de un adolecente");
            }else if (age >= 18 && age <= 64) {
                System.out.println("la edad es la de un adulto");
            }else if (age >=65) {
                System.out.println("la edad es la de un adulto mayor ");
            }else{
                System.out.println("e te pille numero negativo eee, informar del mistake a jedier");
            }
            break;
        case 19:
            int censores;
            System.out.println("bienvenido");
            System.out.println("por favor ingrese la cantidad de sensores activos");
            censores = sc.nextInt();
            if (censores >= 1 && censores <= 2) {
                System.out.println("alerta baja");
            }else if (censores >= 3 && censores <= 5) {
                System.out.println("alerta media");
            }else if (censores >= 6) {
                System.out.println("alerta alta");
            }else {
                System.out.println("no hay censores activos");
            }
            break;
        case 20:
            int trimestres;
            System.out.println("bienvenido");
            System.out.println("ingrese el numero del mes para saber el trimestre");
            trimestres = sc.nextInt();
            if (trimestres >= 1 && trimestres <= 3) {
                System.out.println("el mes esta ubicado en el primer trimestre");
            }else if (trimestres >= 4 && trimestres <=6) {
                System.out.println("el mes esta ubicado en el segund trimestre");
            }else if (trimestres >= 7 && trimestres <=9) {
                System.out.println("el mes esta ubicado en el tercer trimestre");
            }else if (trimestres >= 10 && trimestres <= 12) {
                System.out.println("el mes esta ubicado en cuarto trimestre");
            }else{
                System.out.println("mistake");
            }
            break;
        case 21:
            int lado;
            System.out.println("bienvenido");
            System.out.println("ingre la cantidade lados de su figura");
            lado = sc.nextInt();
            if (lado == 3) {
                System.out.println("tu figura es un triangulo");
            }else if (lado == 4) {
                System.out.println("tu figura es un cuadrado o tringulo");
            }else if (lado == 5) {
                System.out.println("tu figura es un pentagono");
            }else if (lado == 6) {
                System.out.println("tu figura es un hexagono");
            }else{
                System.out.println("figura no soportada");
            }
            break;
        case 22:
            int mes;
            int dia;
            System.out.println("bienvenido");
            System.out.println("ingrese su mes de nacimiento");
            mes = sc.nextInt();
            System.out.println("ingrese su dia de nacimiento");
            dia = sc.nextInt();
            if (mes == 1 && dia >= 20) {
                System.out.println("la persona es acuario");
            }else if (mes == 2 && dia <= 18) {
                System.out.println("la persona es acuario");
            }else if(mes == 2 && dia >= 19){
                System.out.println("la persona es piscis");
            }else if (mes == 3 && dia <= 20) {
                System.out.println("la persona es piscis");
            }else if (mes == 3 && dia >= 21) {
                System.out.println("la persona es Aries");
            }else if (mes == 4 && dia <= 19) {
                System.out.println("la persona es Aries");
            }else if (mes == 4 && dia >= 20) {
                System.out.println("la persona es Tauro");
            }else if (mes == 5 && dia <= 20) {
                System.out.println("la persona es Tauro");
            }else if (mes == 5 && dia >= 21) {
                System.out.println("la persona es Gemenis");
            }else if (mes == 6 && dia <= 20) {
                System.out.println("la persona es Geminis");
            }else if (mes == 6 && dia >= 21) {
                System.out.println("la persona es Cancer");
            }else if (mes == 7 && dia <= 22) {
                System.out.println("la persona es cancer");
            }else if (mes == 7 && dia >= 23) {
                System.out.println("la persona es leo");
            }else if (mes == 8 && dia <= 22) {
                System.out.println("la persona es leo");
            }else if (mes == 8 && dia >= 23) {
                System.out.println("la persona es Virgo");
            }else if (mes == 9 && dia <= 22) {
                System.out.println("la persona es Virgo");
            }else if (mes == 9 && dia >= 23) {
                System.out.println("la persona es Libra");
            }else if (mes == 10 && dia <= 22) {
                System.out.println("la persona es Libra");
            }else if (mes == 10 && dia >= 23) {
                System.out.println("la persona es Escorpio");
            }else if (mes == 11 && dia <= 21) {
                System.out.println("La persona es Escorpio");
            }else if (mes == 11 && dia >= 22) {
                System.out.println("La persona es Sagitario");
            }else if (mes == 12 && dia <= 21) {
                System.out.println("la persona es Sagitario");
            }else if (mes == 12 && dia >= 22) {
                System.out.println("La persona es capricornio");
            }else if (mes == 1 && dia <= 19) {
                System.out.println("La persona es Capricornio");
            }else{
                System.out.println("mistake");
            }
            break;
        case 23:
            double eta;
            double result;
            double result2;
            double result3;
            double eta2 = 10.5;
            System.out.println("bienvenido");
            System.out.println("por favor ingrese la edad del perro");
            eta = sc.nextInt();
            if (eta >= 1 && eta <= 2) {
                result = eta * 5.25;
                System.out.println("la edad del perro en edad humana es "+result);
            }else{
                result2 = eta * 4;
                result3 = result2 + eta2;
                System.out.println("la edad del perro en edad humana es "+result3);
            } 
            break;
        case 24:
            int ica;
            System.out.println("bienvenido");
            System.out.println("Ingrese ICA de la ciudad");
            ica = sc.nextInt();
            if (ica >= 0 && ica <= 50) {
                System.out.println("el indice de contaminacion es bueno");
            }else if (ica >= 51 && ica <= 100) {
                System.out.println("el indice de contaminacion es moderado");
            }else if (ica >= 101 && ica <= 150) {
                System.out.println("el indice de contaminacion es no saludable para grupos sensibles");
            }else if (ica >= 151 && ica <= 200) {
                System.out.println("el indice de contaminacion es no saludable");
            }else if (ica >= 201 && ica <= 300) {
                System.out.println("el indice de contaminacion es muy no saludable");
            }else if (ica >= 301) {
                System.out.println("el indice de contaminacion es muy peligroso");
            }else{
                System.out.println("mistake");
            }
            break;
        default:
            System.out.println("Caso elegido no exite");    
            }  
        }
    }
}