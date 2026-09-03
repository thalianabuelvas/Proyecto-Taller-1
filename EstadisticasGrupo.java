import java.util.Scanner;

public class EstadisticasGrupo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos el arreglo para guardar las notas de los 10 estudiantes
        double[] notas = new double[10];

        // Variable para guardar la suma de todas las notas
        double suma = 0;

        // Variebles para aprobar y reprobar
        int aprobados = 0;
        int reprobados = 0;

        // Ahora pedimos las 10 notas al usuario
        for (int i = 0; i < notas.length; i++) {

            System.out.println("Ingresa la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            // Sumamos la nota para calcular le promedio despues
            suma = suma + notas[i];
        }

        // Iniciamos con la nota mas alta y más baja
        double notaAlta = notas[0];
        double notaBaja = notas[0];

        // Guardamos la posicion de la nota alta y baja
        int posicionAlta = 0;
        int posicionBaja = 0;

        // Ahorramos vamos al arreglo para busacr las notas
        for (int i = 0; i < notas.length; i++) {

            // Comparamos para encontrar la nota mas alta, usaremos if, para que se mas
            // facil
            if (notas[i] > notaAlta) {
                notaAlta = notas[i];
                posicionAlta = i;
            }

            // Comparamos para encontrar la nota mas baja
            if (notas[i] < notaBaja) {
                notaBaja = notas[i];
                posicionBaja = i;
            }

            // Verificamos si el estudiante aprobbó
            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // Seguimos ahora con el calculo del promedio
        double promedio = suma / notas.length;

        // Mostramos los resultados acá
        System.out.println("\n Estadisitcas del grupo: " + promedio);

        System.out.println("Nota más alta: " + notaAlta);

        System.out.println("Posición de la nota mas Alta: " + posicionAlta);

        System.out.println("Nota más baja: " + notaBaja);

        System.out.println("Estudiantes aprobados: " + aprobados);

        System.out.println("Estudiantes reprobado: " + reprobados);

        //Aqui cerramos el Scanner
        sc.close(); //Pruebas???, 

    }

}
