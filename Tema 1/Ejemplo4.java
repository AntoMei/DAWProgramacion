import java.util.Scanner;
public class Ejemplo4 {
    public static void main(String args[]){
        float side;
        float squareArea;
       
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        
        System.out.println("Enter the side:");
        side = inputValue.nextFloat();

        squareArea = side * side;
        System.out.println(squareArea);
        inputValue.close();
    }
}