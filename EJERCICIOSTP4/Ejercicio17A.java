public class Ejercicio17A {
    public static void main(String[] args) {
        int evaluacion1 = 8;
        int evaluacion2 = 5;
        int evaluacion3 = 6;

        int sumaPares = 0;

        if (evaluacion1 % 2 == 0) {
            sumaPares += evaluacion1;
        }
        if (evaluacion2 % 2 == 0) {
            sumaPares += evaluacion2;
        }
        if (evaluacion3 % 2 == 0) {
            sumaPares += evaluacion3;
        }

        System.out.println("La suma de los valores pares es: " + sumaPares);
    }
}
