
//ejercicio 3.4
import java.util.Scanner;

public class ValidacionEntrada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;

        // Pedimos la edad por primera vez
        System.out.print("Ingresa tu edad: ");
        edad = sc.nextInt();

        // Ahora mientras la edad no esté dentro del rango permitido
        while (edad < 1 || edad > 120) {

            // Mandamos ahora un mensaje indicando Error
            System.out.println("Error, la edad debe estar entre 1 y 120 años");

            // Y volvemos a pedir la edad
            System.out.print("Ingresa tu edad: ");
            edad = sc.nextInt(); // Toca aprender buenas paracticas Corazon, aqui vemos una variable edad que se
                                 // consume de est

        }

        // Ahora toca salir del While
        System.out.println("Edad válida");

        // Vamos a clasificar ahora a la persona segun su edad
        if (edad >= 1 && edad <= 12) {
            System.out.println("Etapa: Niñez");

        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Etapa: Adolecencia");

        } else if (edad >= 18 && edad <= 25) {
            System.out.println("Etapa: Juventud");
        } else if (edad >= 26 && edad <= 59) {
            System.out.println("Etapa: Adultez");

        } else {
            System.out.println("Etapa: Tercera edad");
        }

        sc.close();

    }

}