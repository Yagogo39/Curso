import java.util.Arrays;
//import java.util.Collections;

public class EjemploArrreglosForInversoMutable {

    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB",
                "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook",
                "Macbook Air",
                "Chromecast 4ta Generacion",
                "Bicicleta Oxford" };

                int total = productos.length;

        Arrays.sort(productos); // Ordena de forma alfabetica de la A a la Z

        arregloInverso(productos);

        ////Collections.reverse(Arrays.asList(productos));

        System.out.println("\nUsando for");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }
    }

    public static void arregloInverso(String[] arreglo){
        int total = arreglo.length;
        for(int i = 0; i <total/2; i++){ //Punto de quiebre, por eso se divide sobre dos
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];

            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
        }
    }
}
