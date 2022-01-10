public class AnalizaString {
    public static int cuantosSonDigitos(String cadena) {
		int contador = 0;
		for(int i = 0; i < cadena.length(); i++){
			if (Character.isDigit(cadena.charAt(i))){
				contador++;
			}
		}
		return contador;
    }

    public static int numLetras(String cadena) {
        int frase = cadena.length();
        return frase;
        }

    public static int numCaracteres(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == '?')
            contador++;
        }
        return contador;
    }
    
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Leer la cadena:");
        System.out.println("La cadena tiene " +cuantosSonDigitos(cadena)+" dígitos");
        System.out.println("La cadena tiene " +numLetras(cadena)+ " letras");
        System.out.println("La cadena tiene " +numCaracteres(cadena)+ " caracteres");
	}
}