import java.util.Scanner;

public class EjemploArregloDetectarOrden {

    public static void main(String[] args) {
        
        int[] num = new int[7];

        System.out.println("Ingrese siete numeros");
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            num[i] = s.nextInt();
        }

        boolean ascendete = false;
        boolean descendente = false;

        for(int i = 0; i< num.length -1; i++){
            if(num[i]> num[i+1]){
                descendente= true;
            }
            if(num[i] < num[i+1]){
                ascendete = true;
            }
        }
        if(ascendete==true &&  descendente == true){
            System.out.println("Arreglo desordenado");
        }

        if(ascendete==false &&  descendente == false){
            System.out.println("Arreglo con los mismos valores");
        }

        if(ascendete==true &&  descendente == false){
            System.out.println("Arreglo ascendente");
        }
        
        if(ascendete==false &&  descendente == true){
            System.out.println("Arreglo descendente");
        }
    }

}
