class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Diego");
        System.out.println("Iniciamos el metodo main");

        System.out.println("persona.nombre; = " + persona.leerNombre());
        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("Despues de llamar al metodo test");

        System.out.println("persona = " + persona.leerNombre());

        System.out.println("Finaliza el metodo main con los datos del arreglo modificado");
    }

    public static void test(Persona persona) {

        System.out.println("Iniciamos con el metodo test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza con el metodo test");
    }
}
