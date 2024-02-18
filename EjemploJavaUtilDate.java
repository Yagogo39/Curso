import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat
                (" 'fecha' yyyy.MM.dd G 'ho" +
                        "ra' HH:mm:ss z");
        String fechaStr = df.format(fecha);
        System.out.println("fechaDf = " + fechaStr);

    }
}
