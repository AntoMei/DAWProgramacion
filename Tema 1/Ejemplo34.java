import java.util.Scanner;
public class Ejemplo34 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numeroNIE;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int 0 = X;
        int 1 = Y;
        int 2= Z;
        System.out.println("Introduce tu número de NIE sin letra:");
        numeroNIE = inputValue.nextInt();
        inputValue.close();



        System.out.println("El numero de DNI es:"+numeroNIE+ "-" +letras.charAt(numeroNIE%23));
    }
}