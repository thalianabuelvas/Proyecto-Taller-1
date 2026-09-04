import java.util.Scanner;
public class PromedioPonderadoA {
    public static void main(String[] args)  {
     Scanner sc = new Scanner(System.in);

System.out.println("Ingresa nota (valores de 0.0-5.0) de pacial 1: ");
        double parcial1 = sc.nextDouble();
System.out.println("Ingresa nota (valores de 0.0 - 5.0) de pracial 2: ");
        double parcial2 = sc.nextDouble();
System.out.println("Ingresa nota (valores de 0.0 - 5.0) de examen final: ");
        double examenFinal = sc.nextDouble();
        

double definitiva =(parcial1 * 0.30) +( parcial2 * 0.30) + (examenFinal * 0.40);
double resultado = (double) ( definitiva * 100 ) / 100;
       
System.out.println("La nota definitiva es   " + resultado);

String estado = (resultado >= 3.0) ? "Aprobado" : "Reprobado";
System.out.println("El estudiante está: " + estado);

sc.close();
     }
    
}