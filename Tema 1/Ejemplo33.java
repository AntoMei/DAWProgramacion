import java.util.Scanner;
public class Ejemplo33 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numeroDNI;
        System.out.println("Introduce tu número de DNI:");
        numeroDNI = inputValue.nextInt();
        System.out.printf("La letra que corresponde a %d es %c", numeroDNI, calcularLetra(nuemroDNI));
        inputValue.close();
    }

    private static char calcularLetra(int numeroDNI){
        String miLetra="TRWAGMYFPDXBNJZSQVHLCE";
        int resto = numeroDNI % 23;
        return miLetra.charAt(resto);
    }

    private static char calcularLetraArray(int numeroDNI){
        char caracteres[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resto = numeroDNI % 23;
        return caracteres[resto];
    }
}