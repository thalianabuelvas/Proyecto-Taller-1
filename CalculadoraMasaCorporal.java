import java.util.Scanner;

public class CalculadoraMasaCorporal{ public static void main(String[] args)  {
     Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = sc.nextDouble();
        System.out.print("Ingresa tu altura en metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Tu IMC es: " + imc + "  Bajo peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Tu IMC es: " + imc + "  Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Tu IMC es: " + imc + "  Sobrepeso");
        } else {
            System.out.println("Tu IMC es: " + imc + "  Obesidad");
        };

 sc.close();
    
    }

    
}
