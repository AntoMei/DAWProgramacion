public class Longitud {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduzca la cadena:");
        String palabras [] = Utilidades.dividirEnPalabras(cadena);
        int contador = 0;
        int longitud = Utilidades.leerEntero("mensaje");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == longitud){
                contador++;
            }
        System.out.println("La cadena contiene" + palabras+ "de"+ longitud);
        }
    }
}