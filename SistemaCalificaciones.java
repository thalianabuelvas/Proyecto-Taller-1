// Ejercicio 2.3
import java.util.Scanner;

public class SistemaCalificaciones{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa la nota numerica: ");
    double nota = sc.nextDouble();

    if (nota >= 4.6 && nota <=5.0) {
        System.out.println("A, Excelente");
    } else if (nota >= 4.0 && nota <= 4.5) {
        System.out.println("B, Sobresaliente");
    } else if (nota >= 3.5 && nota <= 3.9) {
        System.out.println("C, Aceptable");
    } else if (nota >= 3.0 && nota <= 3.4) {
        System.out.println("D, Aprobado mínimo" );
    } else {
        System.out.println("F, reprobado");
    }
    sc.close();






    
    
    }
    
}

