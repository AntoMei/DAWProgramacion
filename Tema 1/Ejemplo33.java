import java.util.Scanner;
public class Ejemplo33 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numeroDNI;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        System.out.println("Introduce tu número de DNI sin letra:");
        numeroDNI = inputValue.nextInt();
        inputValue.close();

        letras.charAt(numeroDNI % 23);
        System.out.println("El numero de DNI es:"+numeroDNI+"-" +letras.charAt(numeroDNI%23));
    }
}