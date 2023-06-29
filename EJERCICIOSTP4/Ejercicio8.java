import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Competidor 1 - Elija su jugada (0: Piedra, 1: Papel, 2: Tijera): ");
        int jugada1 = scanner.nextInt();

        System.out.print("Competidor 2 - Elija su jugada (0: Piedra, 1: Papel, 2: Tijera): ");
        int jugada2 = scanner.nextInt();

        if (jugada1 == jugada2) {
            System.out.println("Empate");
        } else if ((jugada1 == 0 && jugada2 == 2) || (jugada1 == 1 && jugada2 == 0) || (jugada1 == 2 && jugada2 == 1)) {
            System.out.println("Competidor 1 es el ganador");
        } else {
            System.out.println("Competidor 2 es el ganador");
        }
    }
}