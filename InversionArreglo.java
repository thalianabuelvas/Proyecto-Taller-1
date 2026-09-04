import java.util.Scanner;

/* Escribe un programa que llene un arreglo de n números enteros (donde n es ingresado por el usuario, máximo 20). 
   Luego invierte el arreglo sin usar un segundo arreglo auxiliar e imprime el arreglo original y el invertido. */
public class InversionArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del arreglo (máximo 20): ");
        int n = sc.nextInt();

        // 1. Validar el tamaño de n
        if (n <= 0 || n > 20) {
            System.out.println("El tamaño del arreglo debe ser un entero positivo menor o igual a 20.");
            sc.close();
            return; // Termina el programa si n no es válido
        }

        // 2. Crear y llenar el arreglo
        int[] arreglo = new int[n];
        System.out.println("Ingresa los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }

        // 3. Imprimir el arreglo original
        System.out.println("Arreglo original:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        // 4. Invertir el arreglo in-place
        int inicio = 0;
        int fin = n - 1;

        while (inicio < fin) {
            int temp = arreglo[inicio];
            arreglo[inicio] = arreglo[fin];
            arreglo[fin] = temp;
            inicio++;
            fin--;
        }

        // 5. Imprimir el arreglo invertido
        System.out.println("Arreglo invertido:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
