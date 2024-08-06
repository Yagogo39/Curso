import java.util.Scanner;

public class EjemploArreglosNumeroMayor {

    public static void main(String[] args) {
        
        int[] a = new int[5];

        Scanner s = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        int max = 1;
        for(int i = 0; i< a.length; i++){
            max = (a[max] > a[i] ? max: i);
        }

        System.out.println("a = " + a[max]);
    }
}
