public class CompararIgnoreCase {

    public static int compararIgonorandoCase(String cadena1, String cadena2){
        return cadena1.compareToIgnoreCase(cadena2);
    }

    public static void main(String[] args) {
        
        String cadena1 = "AABB";
        String cadena2 = "aaaa";
        int resultado = compararIgonorandoCase(cadena1, cadena2);

        if (0 == resultado) {
            System.out.println("Las cadenas son iguales");    
        }
        else if (resultado > 0) {
            System.out.println("'" + cadena1 + "' es mayor que '" + cadena2 + "'");
        }else{
            System.out.println("'" + cadena2 + "' es mayor que '" + cadena1 + "'");
        }
    }
}