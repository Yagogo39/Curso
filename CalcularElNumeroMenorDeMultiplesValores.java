import java.util.Scanner;

public class CalcularElNumeroMenorDeMultiplesValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos valores para comparar deseas ingresar?");
        int numeros = scanner.nextInt();
        System.out.println("Ingresa los valores uno por uno");
        int menor = Integer.MAX_VALUE;
        for(int i = 0; i < numeros; i++){
            int numero = scanner.nextInt();
            if(numero < menor){
                menor = numero;
            }
        }
        System.out.println("El numero menor es: " + menor);
        if(menor < 10){
            System.out.println("El número menor es menor que 10!");
        }else {
            System.out.println("El numero menor es igual o mayor que 10!");
        }
    }
}
