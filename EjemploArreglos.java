import java.util.Arrays;

public class EjemploArreglos {

    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos); //Ordena de forma alfabetica de la A a la Z

        System.out.println("producto[0] = " + productos[0]);
        System.out.println("producto[1] = " + productos[1]);
        System.out.println("producto[2] = " + productos[2]);
        System.out.println("producto[3] = " + productos[3]);
        System.out.println("producto[4] = " + productos[4]);
        System.out.println("producto[5] = " + productos[5]);
        System.out.println("producto[6] = " + productos[6]);

        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = (int)35L;
        numeros[3] = -1;

        Arrays.sort(numeros); //Ordena de menor a mayor

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];

        System.out.println("\ni = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }    
}
