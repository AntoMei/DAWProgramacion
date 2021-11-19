import java.util.Scanner;

public class Positivos {
    public static void positivos(int[] numeros){
        int resultado = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i]>=0){
                resultado++;
            }
        }
        return;
    }
    public static void main(String[] args) {
        int[] numeros;
        int numero;
        Scanner lector = new Scanner (System.in);

        //Empieza el programa
        System.out.println("Escribe 10 números");
        numero = lector.nextInt();
        lector.close();

        positivos(numeros);
    }
}
