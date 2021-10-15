import java.util.Scanner;
public class Ejemplo28 {
    public static void main(String args[]){
        Scanner inputValue = new Scanner(System.in);
        int divisor = 2;
        int numero=0;
        boolean esPrimo = true;

        System.out.println("Introduce un número");
        numero = inputValue.nextInt();
        inputValue.close();
        while((divisor<numero)&& esPrimo){
          }if((numero%divisor)==0){
                esPrimo= false;
                divisor++;
            }
        }
    }