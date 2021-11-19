import java.util.Scanner;

public class Positivos {
    public static void positivos(int[] numeros){
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>=0){
                resultado++;
            }
        System.out.println(resultado);
        }
    }
    public static void main(String[] args) {
        int[] numeros = new int [10];
        Scanner lector = new Scanner (System.in);

        //Empieza el programa
        System.out.println("Escribe 10 números");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = lector.nextInt();  
        }
        lector.close();
        positivos(numeros);
    }
}