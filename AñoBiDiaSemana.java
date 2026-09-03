//Ejercicio 2.5
import java.util.Scanner;

public class AñoBiDiaSemana{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        // Año
        System.out.println("Introduce un año: ");
        int año = sc.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
            System.out.println("el año " + año + " es bisiesto");

        } else {
            System.out.println("el año " + año + "no es bisiesto");
        }
        //Dia de la semana
        System.out.print("Introduce un numero del 1 al 7 para el dia de la semana: ");
        int dia = sc.nextInt();

        switch (dia) {
        case 1:
            System.out.println("lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miercoles");
            break;
        case 4:
            System.out.print("Jueves");
            break;
        case 5:
            System.out.println("viernes");
            break;
        case 6:
            System.out.println("Sabado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println("Dia no valido");
            break;
        }
        sc.close();


    }
}