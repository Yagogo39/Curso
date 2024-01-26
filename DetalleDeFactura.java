import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura");
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese los dos precios de sus productos");
        double producto1;
        double producto2;

        producto1 = scanner.nextDouble();
        producto2 = scanner.nextDouble();

        double suma = producto1 + producto2;
        double impuesto = suma * 0.19;
        double total = suma + impuesto;

        System.out.println("La factura " + nombreFactura + " tiene un total bruto de $" + suma +
                " , con un impuesto de " + impuesto + " y el monto después de impuesto es de $" + total);
    }

}
