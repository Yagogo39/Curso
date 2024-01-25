public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 987665.43e-3;//98.766543
        System.out.println("d = " + d);
        float f = 12345e2f; //123.45
        System.out.println("f = " + f);
        
        datoLogico = f > d;
        System.out.println("datologico = " + datoLogico);
        
        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);
    }
}
