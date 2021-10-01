import java.util.Scanner;
public class Ejemplo12 {
    public static void main (String argv[]) {
        int numero1;
        int numero2;

        System.out.println("Introduce el valor 1");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        numero1 = inputValue.nextInt();

        System.out.println("Introduce el valor 2");
        Scanner inputValue1;
        inputValue1 = new Scanner(System.in);
        numero2 = inputValue1.nextInt();

        if(numero1>numero2) {
            System.out.println("El mas grande es valor 1:"+numero1);
        }
            inputValue.close();
            inputValue1.close();
    }
}

