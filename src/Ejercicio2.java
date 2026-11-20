public class Ejercicio2 {

    static void intercambiar(int[] v, int i, int j) {

        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;

    }

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40};

        System.out.println("Arreglo original:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        intercambiar(numeros, 0, 2);

        System.out.println("Arreglo despues del intercambio:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
