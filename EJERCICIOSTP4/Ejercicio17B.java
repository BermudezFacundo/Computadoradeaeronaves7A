public class Ejercicio17B {
    public static void main(String[] args) {
        int evaluacion1 = 8;
        int evaluacion2 = 5;
        int evaluacion3 = 6;

        int sumaPares = 0;

        sumaPares += evaluacion1 * (evaluacion1 % 2);
        sumaPares += evaluacion2 * (evaluacion2 % 2);
        sumaPares += evaluacion3 * (evaluacion3 % 2);

        System.out.println("La suma de los valores pares es: " + sumaPares);
    }
}
