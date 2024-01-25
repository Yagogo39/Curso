public class Primitivos {
    public static void main(String[] args) {
        
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en bite a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en byte a " + Byte.SIZE);
        System.out.println("valor máximo de un Byte " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un Byte " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bite a " + Short.BYTES);
        System.out.println("tipo short corresponde en byte a " + Short.SIZE);
        System.out.println("valor máximo de un Short " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un Short " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en bite a " + Integer.BYTES);
        System.out.println("tipo int corresponde en byte a " + Integer.SIZE);
        System.out.println("valor máximo de un Int " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un Int " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bite a " + Long.BYTES);
        System.out.println("tipo long corresponde en byte a " + Long.SIZE);
        System.out.println("valor máximo de un long " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long " + Long.MIN_VALUE);

        var numeroVar = 9223372036854775808F;


    }

}
