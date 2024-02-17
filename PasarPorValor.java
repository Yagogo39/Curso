public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Finaliza el metodo main con el valor de i = " + i);
    }

    public static void test(int i) {
        System.out.println("Iniciamos con el metodo test con i = " + i);
        i = 35;
        System.out.println("Finaliza con el metodo test con i = " + i);
    }
}
