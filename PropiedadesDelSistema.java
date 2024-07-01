import java.util.Properties;

public class PropiedadesDelSistema {
    public static void main(String[] args) {
        
        String username = System.getProperty("user.name");
        System.out.println("Username = " + username);
        
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = "+ workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator: " + lineSeparator + "Una linea nueva");

        Properties p = System.getProperties();
        p.list(System.out);
    
    }
}
