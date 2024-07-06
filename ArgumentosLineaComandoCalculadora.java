public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {

        if (args.length != 3){
            System.out.println("Ingrese una operacion y dos numeros");
            System.exit(-1);
        }
        
        String operacion = args[0];
        try{
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;
        }catch(NumberFormatException nfe){
            nfe.printStackTrace();
        }
        switch (operacion) {
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multiplicacion":
                resultado = a*b;
                break;
            case "division":
                if(b == 0){
                    System.out.println("No se puede dividir por cero");
                    System.exit(-1);
                }else{
                    resultado = a/b;
                }
                break;
        
            default:
                resultado = a + b;
        }

        System.out.println("El resultado de la operacion " + operacion +
        " es: \n" + resultado);
    }
    
}
