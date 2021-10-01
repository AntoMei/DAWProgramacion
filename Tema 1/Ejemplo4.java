import java.util.Scanner;
public class Ejemplo4 {
    public static void main (String argv[]) {
        int side;
        int squareArea;

        System.out.println("Enter the side:");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        side = inputValue.nextInt();

        squareArea = side * side;
        System.out.println(squareArea);
        inputValue.close();
    }
}