public class ArregloCaracteres {

    public static void main(String[] args) {

        char[] letras = new char[5];

        for (int indice = 0; indice < letras.length; indice++) {
            System.out.println("Indice: " + indice +
                    ", Valor: " + letras[indice]);
        }

        System.out.println();

        letras[0] = 'A';
        letras[1] = 'B';
        letras[2] = 'C';
        letras[3] = 'D';
        letras[4] = 'E';

        for (int indice = 0; indice < letras.length; indice++) {
            System.out.println("Indice: " + indice +
                    ", Valor: " + letras[indice]);
        }
    }
}