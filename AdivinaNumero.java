// Ejercicio 3.2
import java.util.Scanner;

public class AdivinaNumero{
    public static void main(String[] args) {
        //Creamos el Sacenner para poder leer lo que escriba el usuario
        Scanner scanner = new Scanner(System.in);

        //Ahora generamos un numero aleaterio entre 1 y 100
        int numerosecreto = (int)(Math.random() * 100) + 1;

        //Ahora creamos una variable para guardar el numero que ingresas como usuario
        int numeroIngresado;

        //Contador de intentos
        int intentos = 0;

        System.out.println("Adivina el numero entre 1 y 100:");

        //El ciclo se repiite hasta adivines
        while (true) {
            
            //Aumentamos el numero de inetentos ahora
            intentos++;  //Odio el ;

            //Ingresa el numero
            System.out.println("Intento " + intentos + ": ");
            numeroIngresado = scanner.nextInt();

            //Comparamos el numero ingresado con el numero secreto
            if (numeroIngresado < numerosecreto) {
                
                //Si es menor, indicamos que el numero secreto es mayor
                System.out.println("El numero es mayor.");

            } else if (numeroIngresado > numerosecreto) {

                //Si es mayor, decimos que el numero secreto es menor
                System.out.println("El numero es menor.");
            } else {

                //Si son iguales, el usuario acertó
                System.out.println("¡Correcto Lo lograste en " 
                    + intentos + " intentos.");

                    //Para salir de ciclo usamos
                    break;
                
            }

        }

            //Cerramos aca el Scanner
            scanner.close();
    
    }
    
}
