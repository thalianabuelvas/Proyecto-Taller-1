// Ejercicio 1.1
import java.util.Scanner;

public class Conversion{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Ingresa la temperatura en Celsius ");
        Double Celsius = sc.nextDouble();

        Double Farenheit = (Celsius * 9/5) + 32;
        Double Kelvin = Celsius + 273.15;


        System.out.println(" la temperatura en Fahrenheit es: " + Farenheit + "°F");
        System.out.print(" la temperatura en Kelvin es: " + Kelvin + "°K");
        
        sc.close();



    }   

}