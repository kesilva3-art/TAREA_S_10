public class Ejercicio1 {

    static void intercambiar(int a, int b) {
        int aux = a;
        a = b;
        b = aux;

        System.out.println("Dentro del metodo:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        System.out.println("Antes del intercambio:");
        System.out.println("num1 = " + num2);
        System.out.println("num2 = " + num1);

        intercambiar(num1, num2);

        System.out.println("Despues del intercambio:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
