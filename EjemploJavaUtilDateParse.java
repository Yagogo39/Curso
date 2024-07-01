import java.text.*;
import java.util.*;

public class EjemploJavaUtilDateParse {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingresa una fecha con el formato yyyy-MM-dd");
        try {
            Date fecha = format.parse(scanner.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            if (fecha.after(fecha2)) {
                System.out.println("La fecha es despues que la fecha actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("La fecha es antes que la fecha actual");

            }else if(fecha.equals(fecha2)){
                System.out.println("La fecha es la misma que la fecha actual");
            }

            if(fecha.compareTo(fecha2) > 0){
                System.out.println("La fecha es despues que la fecha actual");
            }else if(fecha.compareTo(fecha2) < 0){
                System.out.println("La fecha es antes que la fecha actual");
            }else if(fecha.compareTo(fecha2) == 0){
                System.out.println("La fecha es la misma que la fecha actual");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
