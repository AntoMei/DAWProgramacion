public class Digitos {

    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduzca la cadena:");
        char [] cadena_num = cadena.toCharArray();
        String n = "";

        for (int i = 0; i < cadena_num.length; i++) {
            if(Character.isDigit(cadena_num[i])){
                n += cadena_num[i];
            }
        }

        System.out.println("Números: "+n);
    }
}