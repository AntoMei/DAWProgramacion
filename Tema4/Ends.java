public class Ends {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introduce cadena1");
		String cadena2 = Utilidades.leerCadena("Introduce cadena2");

        System.out.println(cadena1.endsWith(cadena2));
    }
}
