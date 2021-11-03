import java.util.Scanner;
public class Ejemplo25 {
    public static void main(String args[]){
        int numero;
        int factorial = 1;
        Scanner inputValue = new Scanner (System.in);
        
        System.out.println("Introduce un número entero:");
        numero = inputValue.nextInt();

        if (numero>=0){
            for (int i = 2; i <= numero; i++) {
                factorial *=i;
                
            }
            System.out.printf("El factorial de %d es %d", numero, factorial);
        }else{
            System.out.println("No se puede calcular el factorial");
        }
        inputValue.close();
    }
} 