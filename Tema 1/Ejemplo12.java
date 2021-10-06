import java.util.Scanner;
public class Ejemplo12 {
    public static void main (String argv[]) {
        int numero1;
        int numero2;
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        
        System.out.println("Introduce el valor 1");
        numero1 = inputValue.nextInt();

        System.out.println("Introduce el valor 2");
        numero2 = inputValue.nextInt();

        if(numero1>numero2) {
            System.out.println(numero1+"es mas grande que"+numero2);
        }
        else{
            System.out.println(numero2+"es mas grande que"+numero1);
        }
        inputValue.close();
    }
}