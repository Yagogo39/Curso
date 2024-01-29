public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //500=>2ms, 1000=>16 ms, 10000=>121 ms, 100000 => 4394 ms
            //c += a + b + "\n";//500=>11 ms, 1000=>12 ms, 10000=>63 ms, 100000 => 1579 ms
            sb.append(a).append(b).append("\n"); //500 => 0 ms, 1000=>0 ms, 10000 => 1 ms, 100000 => 11 ms

        }
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
