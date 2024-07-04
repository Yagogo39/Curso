import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"verde", "azul", "rojo", "amarillo", "blanco", "negro"};
        double random = Math.random();
        System.out.println("Random = " + random);
        random *= colores.length;

        System.out.println("Random por 6 = " + random);

        random = Math.ceil(random);
        System.out.println("Random Techo = " + random);

        random = Math.floor(random);
        System.out.println("Piso = " + random);

        System.out.println("Colores = " + colores[(int) random]);

        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25-15);
        System.out.println("RandomInt = " + randomInt);

        long randomLong = randomObj.nextLong();
        System.out.println("RandomLong = " + randomLong);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("RanodmInt = "+ randomInt);
        System.out.println("Colores = " + colores[randomInt]);
    }
}
