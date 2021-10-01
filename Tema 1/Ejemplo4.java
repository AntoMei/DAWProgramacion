import java.util.Scanner;
public class Ejemplo4 {
    public static void main (String argv[]) {
        int x;
        int squareArea;

        System.out.println("Enter the side:");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();

        squareArea = x * x;
        System.out.println(squareArea);
        inputValue.close();
    }
}