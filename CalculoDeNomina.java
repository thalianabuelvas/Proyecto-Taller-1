//Ejercicio 1.2
import java.util.Scanner;

public class CalculoDeNomina{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre del empleado ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa las horas trabajadas ");
        Double horas = sc.nextDouble();

        System.out.print("Ingresa valor de la hora");
        Double valor = sc.nextDouble();

        Double SalarioBruto = valor * horas;
        Double DescuentoSS= SalarioBruto * 0.08;
        Double Retencion = SalarioBruto * 0.05;
        Double SalarioNeto = SalarioBruto - DescuentoSS - Retencion;

        System.out.println ("Empleado " + nombre);
        System.out.println ("Horas trabajadas " + horas);
        System.out.println ("Salario Bruto " + SalarioBruto);
        System.out.println ("Descuento SS " + DescuentoSS);
        System.out.println ("Retencion " + Retencion);
        System.out.println ("Salario neto " + SalarioNeto);
        
        sc.close();



        





        




    }

}

