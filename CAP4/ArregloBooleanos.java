public class ArregloBooleanos {

    public static void main(String[] args) {

        boolean[] estados = new boolean[5];

        for (int indice = 0; indice < estados.length; indice++) {
            System.out.println("Indice: " + indice +
                    ", Valor: " + estados[indice]);
        }

        System.out.println();

        estados[0] = true;
        estados[1] = false;
        estados[2] = true;
        estados[3] = false;
        estados[4] = true;

        for (int indice = 0; indice < estados.length; indice++) {
            System.out.println("Indice: " + indice +
                    ", Valor: " + estados[indice]);
        }
    }
}