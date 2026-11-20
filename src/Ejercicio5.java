public class Ejercicio5 {

    static void sumar(int numero) {

        numero = numero + 5;

        System.out.println("Dentro del metodo: " + numero);
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        sumar(a);
        sumar(b);
        sumar(c);

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);
    }
}
