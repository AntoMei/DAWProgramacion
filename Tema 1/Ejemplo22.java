import java.util.Scanner;
public class Ejemplo22 {
    public static void main(String args[]){
        //Declaración de variables
        int numero; contador; positivos;
        Scanner inputValue = new Scanner (System.in);

         //Empieza el programa
         System.out.println("Escribe 10 números");
        for (numero = 0; numero < 10; numero++){
            numero = inputValue.nextInt();
         inputValue.close();
         if (numero>=0) {
             System.out.println("Positivos");
             
 

         }
        }
    }
}