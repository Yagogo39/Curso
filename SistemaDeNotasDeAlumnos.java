import java.util.Scanner;
public class SistemaDeNotasDeAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNotas = 20;
        double[] notas = new double[totalNotas];
        for (int i = 0; i < totalNotas; i++) {
            System.out.print("Ingrese la nota del alumno numero " + (i + 1) + " (escala de 1 a 7): ");
            notas[i] = scanner.nextDouble();

            if (notas[i] < 1 || notas[i] > 7) {
                System.out.println("La nota debe estar en el rango de 1 a 7.");
                System.out.print("Ingrese la nota del alumno " + (i + 1) + " nuevamente: ");
                notas[i] = scanner.nextDouble();
            }
        }
        double sumaMayoresA5 = 0;
        int conteoDeNotas5 = 0;
        for (double nota : notas) {
            if (nota > 5) {
                sumaMayoresA5 += nota;
                conteoDeNotas5++;
            }
        }
        double promedioMayoresA5 = conteoDeNotas5 > 0 ? sumaMayoresA5 / conteoDeNotas5 : 0;
        double sumaMenoresA4 = 0;
        int conteoDeNotas4 = 0;
        for (double nota : notas) {
            if (nota < 4) {
                sumaMenoresA4 += nota;
                conteoDeNotas4++;
            }
        }
        double promedioMenoresA4 = conteoDeNotas4 > 0 ? sumaMenoresA4 / conteoDeNotas4 : 0;
        int cantidadNotas1 = 0;
        for (double nota : notas) {
            if (nota == 1) {
                cantidadNotas1++;
            }
        }
        double sumaTotal = 0;
        for (double nota : notas) {
            sumaTotal += nota;
        }
        double promedioTotal = sumaTotal / totalNotas;
        System.out.println("\nPromedio de notas mayores a 5: " + promedioMayoresA5);
        System.out.println("Promedio de notas menores a 4: " + promedioMenoresA4);
        System.out.println("Cantidad de notas igual a 1: " + cantidadNotas1);
        System.out.println("Promedio total de notas: " + promedioTotal);
    }
}

