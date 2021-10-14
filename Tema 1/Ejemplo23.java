import java.util.Scanner;
public class Ejemplo23 {
    public static void main(String args[]){
        //Declaración de variables
        int numero= 0;
        int positivos= 0;
        Scanner inputValue = new Scanner (System.in);

        //Empieza el programa
        do
        {
        System.out.println("Introduce los números:");
        numero = inputValue.nextInt();
        positivos=positivos+numero;
        }while(numero!=0);
            System.out.println("Para terminar el programa pulse 0:");
            inputValue.close();
    }
}