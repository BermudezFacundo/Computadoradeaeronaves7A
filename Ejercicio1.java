import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de las notas de las evaluaciones
        System.out.print("Ingrese la nota de la evaluación 1: ");
        double evaluacion1 = scanner.nextDouble();

        System.out.print("Ingrese la nota de la evaluación 2: ");
        double evaluacion2 = scanner.nextDouble();

        System.out.print("Ingrese la nota de la evaluación 3: ");
        double evaluacion3 = scanner.nextDouble();

        // Cálculo del promedio
        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

        // Verificación de aprobación o reprobación
        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}