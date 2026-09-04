import java.util.Scanner;/*Escribe un programa que lea dos números enteros positivos ay b(donde a < b) e imprima todos los números primos en ese rango, separados por comas. Al final, indica cuántos primos se encontraron y cuál es su suma.

Para determinar si un número es primo, use un ciclo whileinterno que verifique si tiene divisores entre 2 y la raíz cuadrada del número ( Math.sqrt()). */
public class NumerosPrimosRango {public static void main(String[] args)  {
     Scanner sc = new Scanner(System.in);

     System.out.print("Ingresa el número a: ");
        int a = sc.nextInt();

    System.out.print("Ingresa el número b: ");
        int b = sc.nextInt();

    if (a <= 0 || b <= 0) {
        System.out.println("Los números deben ser enteros positivos.");
        return;
    }

    if (a >= b) {
        System.out.println("El número a debe ser menor que el número b.");
        return;
    }

    int suma = 0;
    int listaPrimos = 0;

    for (int i = a; i <= b; i++) {
        if (i < 2) {
            continue;
        }
        boolean esPrimo = true;
        int j = 2;
        while (j <= Math.sqrt(i)) {
            if (i % j == 0) {
                esPrimo = false;
                break;
            }
            j++;
        }
        if (esPrimo) {
            if (listaPrimos > 0) {
                System.out.print(", ");
            }
            System.out.print(i);
            suma += i;
            listaPrimos++;
        }
    }

    System.out.println("\nCantidad de primos encontrados: " + listaPrimos);
    System.out.println("Suma de los primos: " + suma);
}

    
}
