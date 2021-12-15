public class Longitud {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduzca la cadena:");
        String palabras [] = Utilidades.dividirEnPalabras(cadena);
        int contador = 0;
        int longitud = Utilidades.leerEntero("Contar palabras:");

        for (String palabra : palabras){
            if (palabra.length() == longitud){
                contador++;
            }

}