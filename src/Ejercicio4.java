public class Ejercicio4 {

    static double perimetro(double lado) {

        return lado * 4;

    }

    static double perimetro(double a, double b) {

        return 2 * (a + b);

    }

    public static void main(String[] args) {

        double lado = 5;

        double resultado1 = perimetro(lado);

        System.out.println("Perimetro del cuadrado: " + resultado1);

        double largo = 8;
        double ancho = 4;

        double resultado2 = perimetro(largo, ancho);

        System.out.println("Perimetro del rectangulo: " + resultado2);
    }
}
