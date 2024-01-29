import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del familiar 1");
        String familiar1 = scanner.nextLine();
        System.out.println("Ingrese el nombre del familiar 2");
        String familiar2 = scanner.nextLine();
        System.out.println("Ingrese el nombre del familiar 3");
        String familiar3 = scanner.nextLine();



        String mayusc = familiar1.toUpperCase();
        String mayus = String.valueOf(mayusc.charAt(1));
        System.out.print("\n"+mayus + "." + (familiar1.substring(familiar1.length()-2)) + "_");


        String mayusc1 = familiar2.toUpperCase();
        String mayus1 = String.valueOf(mayusc1.charAt(1));
        System.out.print(mayus1 + "." + (familiar2.substring(familiar2.length()-2)) + "_");


        String mayusc2 = familiar3.toUpperCase();
        String mayus2 = String.valueOf(mayusc2.charAt(1));
        System.out.println(mayus2 + "." + (familiar3.substring(familiar3.length()-2)));

    }
}
