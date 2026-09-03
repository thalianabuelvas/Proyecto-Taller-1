//Ejercicio 2.1
import java.util.Scanner;

public class ClasificacionTriangulos{
     public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer lado: ");
        double a = sc.nextDouble();

         System.out.print("Ingrese el segundo lado: ");
        double b = sc.nextDouble();

         System.out.print("Ingrese el tercer lado: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a){
            if (a == b && b == c){
                System.out.println("Equilátero (todos los lados son iguales)");
            } else if (a == b || b == c || a == c){
                System.out.println("Isosceles (dos lados iguales)"); 
            } else {
                System.out.println("Escaleno (los tres lados son diferentes)");
            }
        }   else {
            System.out.println("los lados que ingresaste no forman untriangulo valido");
        }

        sc.close();

     }
    
}