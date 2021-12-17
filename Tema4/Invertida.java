public class Invertida {

    public static String [] palabras (String cadena){
        String palabras [] = cadena.split(" ");
        return palabras;
    }
    public static String invertir(String[] palabras){
        String invertida = "";

        for (int i = palabras.length -1; i >=0; i--) {
            invertida = invertida + palabras[i]+" ";
        }
        return invertida;
    }
    public static void main(String[] args) {
        String cadena = invertir(Utilidades.dividirEnPalabras(Utilidades.leerCadena("Introduce la cadena")));
        System.out.println(cadena);
    }
}