import java.util.Scanner;

public class AreaDePerimetroDeFiguras{
      public static void main(String[] args)  {
     Scanner sc = new Scanner(System.in);

     System.out.print("Ingresa valor en numero de la altura: ");
     double altura = sc.nextDouble();
     
     System.out.print("Ingresa valor en numero de la base: ");
     double base = sc.nextDouble();

     System.out.print("ingresa el radio del circulo:");
        double radio = sc.nextDouble();

     double area = base * altura;
     double perimetro = 2 * (base + altura);
     double areaCirculo = Math.PI * radio * radio;
     double circunferencia = 2 * Math.PI * radio;

    


     System.out.println("el area del rectangulo es:" + area );
     System.out.println("el perimetro del rectangulo es: " + perimetro);
     System.out.println("el area del circulo es: " + areaCirculo);
     System.out.println("la circunferencia del circulo es: " + circunferencia);

     sc.close();
     }

}