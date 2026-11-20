public class Ejercicio3 {

    static void aplicarDescuento(double[] precios, double pct) {

        for (int i = 0; i < precios.length; i++) {

            precios[i] = precios[i] - (precios[i] * pct / 100);

        }
    }

    public static void main(String[] args) {

        double[] precios = {10, 20, 30, 40};

        System.out.println("Precios originales:");

        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }

        aplicarDescuento(precios, 10);

        System.out.println("Precios con descuento:");

        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
    }
}
