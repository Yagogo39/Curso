import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[]valores = new int[2];
        int multi = 1;
        for(int i = 0; i < 2; i++) {
            System.out.println("Ingrese un numero(positivo o negativo)");
            valores[i] = scanner.nextInt();
            multi *= valores[i];
        }
        System.out.println("El resultado es: " + multi);
    }
}
