public class Longitud {

    public static int cuantasDeLongitud(String[] palabras, int longitud) {
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == longitud){
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduzca la cadena:");
        String palabras [] = Utilidades.dividirEnPalabras(cadena);
        int longitud = Utilidades.leerEntero("mensaje");

        System.out.printf("La cadena contiene %d palabras de longitud %d", cuantasDeLongitud(palabras, longitud), longitud);
	}
}