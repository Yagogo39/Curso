import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo del cual "+
        "deseas calculaar su area:");
        double radio = s.nextDouble();

        //Hacer uso de Math, para poder usar Pi, y su valor

        radio = Math.pow(radio, 2);
        System.out.println("El area del circulo es:\n" + 
        (Math.PI * radio));
    }
}
