import java.util.Scanner;
public class Ejemplo22 {
    public static void main(String args[]){
        //Declaración de variables
        int numero; 
        int contador = 0;
        int positivos = 0;
        Scanner inputValue = new Scanner (System.in);

         //Empieza el programa
         System.out.println("Escribe 10 números");
        while(contador<10){
            numero = inputValue.nextInt();
            if (numero>=0){
                positivos = positivos + 1;
            }
            contador = contador +1;
        }
        inputValue.close();
        System.out.println("Hay"+positivos+"números positivos");
    }
}