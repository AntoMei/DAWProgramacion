public class IndexOf {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introduce cadena 1");
        String cadena2 = Utilidades.leerCadena("Introduce cadena 2");

        System.out.println(cadena1.indexOf(cadena2));
    }
}