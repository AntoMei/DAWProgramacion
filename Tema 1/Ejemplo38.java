import java.util.Scanner;
public class Ejemplo38 {
    public static void main(String[] args) {
        int vocalA =0;
        int vocalE =0;
        int vocalI =0;
        int vocalO =0;
        int vocalU =0;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = lector.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            switch (Character.toUpperCase(texto.charAt(i))) {
                case 'A':
                    vocalA++;
                    break;
            
                default:
                    break;
            }
        }