public class Concat {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introduce cadena1");
		String cadena2 = Utilidades.leerCadena("Introduce cadena2");

        String cadena3 = cadena1.concat(cadena2);

        System.out.println(cadena3);

    }
    
}