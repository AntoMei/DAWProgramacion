import java.util.Scanner;
public class Ejemplo27 {
    public static void main(String args[]){
    Scanner inputValue = new Scanner(System.in);
    int N;
    
    System.out.println("Introduza el valor de N");
    N = inputValue.nextInt();
    inputValue.close();
    
    System.out.println(N/10000);
    System.out.println(N/1000);
    System.out.println(N/100);
    System.out.println(N/10);
    System.out.println(N);
    }
}