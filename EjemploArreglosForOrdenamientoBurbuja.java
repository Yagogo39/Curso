//import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB",
                "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook",
                "Macbook Air",
                "Chromecast 4ta Generacion",
                "Bicicleta Oxford" };

        int total = productos.length;

        sortBurbuja(productos);

        System.out.println("\nUsando for");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }

        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;


        int totalNumeros = numeros.length;

        sortBurbuja(numeros);

        for(int i = 0; i < totalNumeros; i++){
            System.out.println("Numero: " + numeros[i]);
        }
    }

    public static void arregloInverso(String[] arreglo) {
        int total = arreglo.length;
        for (int i = 0; i < total / 2; i++) { // Punto de quiebre, por eso se divide sobre dos
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];

            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void sortBurbuja(Object[]arreglo){

        int totalNumeros = arreglo.length;
        int contador=0;

        for (int i = 0; i < totalNumeros - 1; i++) { // En la ultima vuelta ya va a estar ordenado
            for (int j = 0; j < totalNumeros - 1 - i; j++) { // Se van ordenando los elementos, admeas de que se
                // le resta uno para que ocurra un desbordamiento
                if (((Comparable)arreglo[j + 1]).compareTo(arreglo[j]) > 0) { //Se hace un cast
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("\nContador: " + contador);

    }
}
