import java.util.Scanner;
public class Ejemplo23 {
    public static void main(String args[]){
        //Declaración de variables
        int numero; 
        int positivos = 0;
        Scanner inputValue = new Scanner (System.in);

        //Empieza el programa
        System.out.println("Escribe los números");
        numero = inputValue.nextInt();
        while(numero !=0){
            if (numero >=0){
                positivos = positivos +1;
            }
            numero = inputValue.nextInt();

        }
        System.out.println("Hay"+positivos+"número positivos");
        inputValue.close();
    }
}