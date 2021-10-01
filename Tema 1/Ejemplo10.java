import java.util.Scanner;
public class Ejemplo10 {
    public static void main (String argv[]) {
        int valor;

        System.out.println("Introduce la numero");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        valor = inputValue.nextInt();

        if (valor >=0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");

            inputValue.close();

        }
    }
}