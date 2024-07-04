public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("Absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("Absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("Max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("Min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = "+ techo);

        double piso = Math.floor(3.5);
        System.out.println("Piso = " + piso);

        long entero = Math.round(Math.PI);
        System.out.println("Entero = " + entero);

        System.out.println("Pi = " + Math.PI);
        System.out.println("euler = " + Math.E );

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("Log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("Potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("Raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Radianes = " + radianes );

        System.out.println("Sin(90): " + Math.sin(radianes));
        System.out.println("Cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("Cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("Cos(0): " + Math.cos(radianes));
    }
}
