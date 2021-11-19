import java.util.Scanner;
public class Ejemplo30 {
    public static void main(String[] args) {
        String palabra;
        int longitud;
        double laMitadDeLaLongitud;
        boolean espalindromo = true;
        Scanner lector = new Scanner(System.in);

        System.out.println("Escribeme una palabra para saber si es palíndroma: ");
        palabra = lector.nextLine();


        longitud = palabra.length();
        laMitadDeLaLongitud = longitud/2;

        for (int i = 1; i < laMitadDeLaLongitud; i++) {
            if(palabra.charAt(i -1) != palabra.charAt(longitud - i)){
            espalindromo = false;
            }
        }

        if(espalindromo == true){
            System.out.println("La palabra es palíndroma");
        } else if(espalindromo == false){
            System.out.println("La palabra no es palíndroma");
        }
        lector.close();
    }
}