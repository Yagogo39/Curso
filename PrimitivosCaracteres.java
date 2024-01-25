public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        char decimal = 64;
        
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte:" + System.lineSeparator()+ Character.BYTES);
        System.out.println("char corresponde en bites a " + Character.SIZE);
        System.out.println("valor minimo del char es " + Character.MIN_VALUE);
        System.out.println("valor maximo del char es" + Character.MAX_VALUE);



    }
}
