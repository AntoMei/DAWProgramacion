public class Digitos {

    public static int cuantosDigitos(String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(Character.isDigit(cadena.charAt(i))){
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduzca la cadena:");

        System.out.println(cuantosDigitos(cadena));
    }
}
