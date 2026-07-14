public class ArregloTextos {

    public static void main(String[] args) {

        String[] nombres = new String[5];

        for (int indice = 0; indice < nombres.length; indice++) {
            System.out.println("Indice: " + indice +
                    ", Valor: " + nombres[indice]);
        }

        System.out.println();

        nombres[0] = "Juan";
        nombres[1] = "Pedro";
        nombres[2] = "Maria";
        nombres[3] = "Ana";
        nombres[4] = "Luis";

        for (int indice = 0; indice < nombres.length; indice++) {
            System.out.println("Indice: " + indice +
                    ", Valor: " + nombres[indice]);
        }
    }
}