// Ejercicio 1.4
import java.util.Scanner;

public class TiempoDeViaje{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu tiempo de viaje en minutos ");
        int minutosTotales = sc.nextInt();

        int TiempoHoras = minutosTotales / 60;
        int MinutosRestantes = minutosTotales % 60;
        int segundosTotales = minutosTotales * 60;

        System.out.println("Tiempo ingresado: " + minutosTotales + "minutos");
        System.out.println("Equivale a: " + TiempoHoras + " horas, " + MinutosRestantes + " min");
        System.out.println("En segundos: " + segundosTotales);

        sc.close();






    }

}
    