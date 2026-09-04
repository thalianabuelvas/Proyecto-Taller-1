import java.util.Scanner;

public class ArregloNombres{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String[] pacientes = new String[8];

        //llenar el arreglo con los nombres
        for (int i = 0; i < pacientes.length; i++){
            System.out.print("Ingrese nombre del paciente" + (i + 1) + ": ");
            pacientes[i] = sc.nextLine();
        }

        //Pedir el nombre 
        System.out.print("\n Ingrese el nombre del paciente a buscar: ");
        String buscado = sc.nextLine();

        //Recorrer el arreglo
        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < pacientes.length; i++){
            if (pacientes[i].equalsIgnoreCase(buscado)){
                encontrado = true;
                posicion = i;
                break;
            }


        }

        //Mostrar el resultado
        if (encontrado){
            System.out.println("El paciente " + buscado + " fue encontrado en la posicion " + posicion );

        }else{
            System.out.println("El paciente    " + buscado + " no se encuentra registrado");

        }
        
        sc.close();

    }
}