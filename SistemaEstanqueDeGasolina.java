import java.util.Scanner;

public class SistemaEstanqueDeGasolina {
    public static void main(String[] args) {

        String estado = "";
        double litros = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la medida actual del estaque de gasolina en litros");
        litros = scanner.nextDouble();


        if (litros == 70){
            System.out.println("Estanque lleno");
        }else if (litros > 59 && litros < 70) {
            System.out.println("Estanque casi lleno");
        } else if (litros > 39 && litros < 60) {
            System.out.println("Estanque 3/4");
        } else if (litros > 34 && litros < 40) {
            System.out.println("Medio Estanque");
        } else if (litros > 19 && litros < 35) {
            System.out.println("Suficiente");
        } else if (litros >= 0 && litros < 20){
            System.out.println("Insuficiente");
        }
    }
}
