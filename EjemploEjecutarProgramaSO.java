import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("calc");
            }
            else if(System.getProperty("os.name").toLowerCase().startsWith("Mac")){
                proceso = rt.exec("textedit");
            }else if(System.getProperty("os.name").toLowerCase().startsWith("Nux") ||
            System.getProperty("os.name").toLowerCase().startsWith("Nix")){
                proceso = rt.exec("gedit");
            }
            
            else{
                proceso =rt.exec("gedit");
            }

            proceso.waitFor();
        } catch (Exception e) {
            System.out.println("El comando es desconocido " + e.getMessage());
            System.exit(1);;
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
