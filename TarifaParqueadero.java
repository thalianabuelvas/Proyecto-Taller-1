import java.util.Scanner;
public class TarifaParqueadero { public static void main(String[] args)  {
     Scanner sc = new Scanner(System.in);

     System.out.print("Ingresa el tipo de vehículo (1=Moto, 2=Carro, 3=Camioneta): ");
     int tipoVehiculo = sc.nextInt();

     double primeraHora = 0;
    double horaAdicional = 0;
    switch (tipoVehiculo){
        case 1: 
        primeraHora = 2.000;
        horaAdicional = 1.500;
            break;
        case 2:
        primeraHora = 4.000;
        horaAdicional = 3.000;
            break;
        case 3:
        primeraHora = 5.000;
        horaAdicional = 4.000;
            break;
        default:
            System.out.println("Opción no válida.");
            return;
        }

    System.out.print("Ingresa el número de horas de permanencia (entero mayor a 0): ");
    int horas = sc.nextInt();

    if (horas <= 0) {
        System.out.println("El número de horas debe ser mayor a 0.");
    }
    

        Double totalpagar = primeraHora + (horas - 1) * horaAdicional;
        double resultado = (double) (totalpagar * 1000);
        System.out.println("El total a pagar es:$ " + resultado);
        

        sc.close();



    



     
     


    
    }
    }

    

