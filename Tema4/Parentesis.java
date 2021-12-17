public class Parentesis {
    public static boolean siParentizada(String cadena){
        int parentesis = 0;

        for (char letra : cadena.toCharArray()) {
            if(letra == '('){
                parentesis++;
            }else if(letra == ')'){
                    parentesis--;
            }
            if (parentesis == -1) {
				return false;
			}
		}
        return (parentesis == 0);
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduzca la cadena:");

        if(siParentizada(cadena)){
            System.out.println("La cadena está bien parentizada");
        }else{
            System.out.println("La cadena no está bien parentizada");
        }
    }
}  