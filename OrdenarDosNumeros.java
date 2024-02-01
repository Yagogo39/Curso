import java.util.Scanner;

public class OrdenarDosNumeros {
    public static void main(String[] args) {

        int numMayor;
        int numMenor;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Si los ordenamos de mayor a menor" +
                " quedarían así:");
        numMayor = num1 > num2 ? num1: num2;
        numMenor = num1 < num2 ? num1: num2;

        System.out.println("Numero Mayor =" + numMayor);
        System.out.println("Numero Menor = " + numMenor);
    }
}
