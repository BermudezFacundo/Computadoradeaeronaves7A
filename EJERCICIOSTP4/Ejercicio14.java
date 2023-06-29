import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la posición del competidor: ");
        int posicion = scanner.nextInt();

        String medalla;

        switch (posicion) {
            case 1:
                medalla = "Oro";
                break;
            case 2:
                medalla = "Plata";
                break;
            case 3:
                medalla = "Bronce";
                break;
            default:
                medalla = "Ninguna";
                break;
        }

        if (posicion >= 1 && posicion <= 3) {
            System.out.println("El competidor obtiene la medalla de " + medalla + ".");
        } else {
            System.out.println("Siga participando.");
        }
    }
}