public class Siglas {
    public static String [] palabras(String cadena){
        String palabras [] = cadena.split(" ");
        return palabras;
    }
    public static String siglas(String[] palabras){
        String siglas = "";
        for (String palabra : palabras) {
            char letra = palabra.charAt(0);
            if (Character.isUpperCase(letra)){
                siglas = siglas + letra;
            }
        }
        return siglas;
    }
    
    public static void main(String[] args) {
        String cadena = siglas(Utilidades.dividirEnPalabras(Utilidades.leerCadena("Introduce la cadena:")));
        System.out.println(cadena);
        
    }
}