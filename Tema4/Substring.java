public class Substring {
    public static String substring(String cadena, int inicio, int fin){
        return cadena.substring(inicio, fin + 1);
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduzca la cadena:");
        int inicio = 0;
        int fin = 0;

        inicio = Utilidades.leerEntero("De la posición");
        fin = Utilidades.leerEntero("A la posición");

        System.out.println("La subcadena resultante es: " + substring(cadena, inicio, fin + 1));
    }

}