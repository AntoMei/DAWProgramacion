public class Longitud3 {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduca la cadena:");
        String palabras[] = Utilidades.dividirEnPalabras(cadena);
        int longitud = Utilidades.leerEntero("mensaje");
        boolean sonCortas = false;

        for (String palabra : palabras) {
            if (palabra.length() >= longitud) {
                sonCortas = true;
            }
        }
        if (sonCortas) {
            
        }

  