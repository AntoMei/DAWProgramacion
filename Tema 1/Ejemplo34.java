import java.util.Scanner;
public class Ejemplo34 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numeroDNI;
        int valorLetra;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        System.out.println("Introduce tu número de NIE sin letra:");
        numeroDNI = inputValue.nextInt();
        inputValue.close();
        System.out.println("El numero de DNI es:"+numeroDNI+ "-" +letras.charAt(numeroDNI%23));
    }
}      