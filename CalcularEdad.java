import java.util.*;
import java.text.*;
public class CalcularEdad {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendario = Calendar.getInstance();
        Date fechaActual = calendario.getTime();
        System.out.println("Ingresa tu fecha de nacimiento " 
        +"con formato yyyy-MM-dd");
        try {
            Date fecha = format.parse(s.nextLine());
            long milisegundos = fechaActual.getTime() - fecha.getTime();
            long dias = (milisegundos / (1000 * 60 * 60 * 24));
            long años = dias / 365;
            if(años <= 0){
                System.out.println("Ingresa una fecha valida");
            }else{
                System.out.println("Tu edad es: " + años + " años");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
