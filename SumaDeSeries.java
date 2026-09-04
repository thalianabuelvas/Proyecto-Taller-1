import java.util.Scanner;
public class SumaDeSeries {public static void main(String[] args)  {
     Scanner sc = new Scanner(System.in);

     System.out.print("Ingresa un número entero positivo n: ");
        int n = sc.nextInt();

    if (n <= 0) {
        System.out.println("El número debe ser un entero positivo.");
        return;
    }
    
        int sumaNaturales = 0;
        int sumaPares = 0;
        int sumaCuadrados = 0;

        for (int i = 1; i <= n; i++) {
            sumaNaturales = sumaNaturales += i;
            sumaPares = sumaPares += (2 * i);
            sumaCuadrados = sumaCuadrados += (i * i);
        }
          int formulaNaturales = n * (n + 1) / 2;
            int formulaPares = n * (n + 1);
            int formulaCuadrados = n * (n + 1) * (2 * n + 1) / 6;

        System.out.println("Suma de los primeros " + n + " números naturales: " + sumaNaturales);
        System.out.println("Fórmula cerrada: n(n + 1)/2 = " + formulaNaturales);
        System.out.println("Suma de los primeros " + n + " números pares: " + sumaPares);
        System.out.println("Fórmula cerrada: n(n + 1) = " + formulaPares);
        System.out.println("Suma de los primeros " + n + " cuadrados perfectos: " + sumaCuadrados);
        System.out.println("Fórmula cerrada: n(n + 1)(2n + 1)/6 = " + formulaCuadrados);
            sc.close();
        }



        
    
    }
    

