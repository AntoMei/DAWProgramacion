import java.util.Scanner;
public class Ejemplo8 {
    public static void main (String argv[]) {
        int edad;

        System.out.println("Introduce la edad");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        edad = inputValue.nextInt();

        if (edad >= 18){
            System.out.println("Mayor de edad");
        }
    }
}
        
    
