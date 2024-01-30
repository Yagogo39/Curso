public class OperadoresIncrementales {
    public static void main(String[] args) {

        //pre-incremento
        int i = 1;
        int j = ++i; //i = i + 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post-incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //pre-decremento
        i = 3;
        j = --i; // i = i -1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post-decremento
        i = 4;
        System.out.println("inicial de i = " + i);
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);
    }
}
