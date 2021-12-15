public class Longitud2 {
    public static boolean tieneLongitud(String[] palabras, int longitud){
        for (String palabra : palabras) {
			if (palabra.length() == longitud) {
				return true;
			}
		}
		return false;
		
	}
    
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduzca la cadena:");
        String palabras [] = Utilidades.dividirEnPalabras(cadena);
        int longitud = Utilidades.leerEntero("mensaje");

        if (tieneLongitud(palabras, longitud)){
            System.out.printf("La cadena contiene al menos 1 palabra de longitud %d", longitud);
		}else {
			System.out.printf("La cadena NO contiene ninguna palabra de longitud %d", longitud);
		}
	}

}