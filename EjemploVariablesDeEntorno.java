import java.util.*;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente de sistema" + varEnv);
        
        String username = System.getenv("USERNAME");
        System.out.println("Username = " + username);
    
        System.out.println("listando varibales de entorno del sistema\n");
        for(String key: varEnv.keySet()){
            System.out.println(key + "..." + varEnv.get(key));
        }

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("\nJavaHome = " + javaHome);

        String tendir = System.getenv("TEMP");
        System.out.println("tendir = " + tendir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String appenv = varEnv.get("APLICATION_ENV");
        System.out.println("appEnv = " + appenv);

        
    }
}
