import java.util.Scanner;
public class Ejemplo27 {
    public static void main(String args[]){
    Scanner inputValue = new Scanner(System.in);
    int numero;
    
    System.out.println("Introduza el valor de N");
    numero = inputValue.nextInt();
    inputValue.close();
    
    System.out.println(numero/10000);
    System.out.println(numero/1000);
    System.out.println(numero/100);
    System.out.println(numero/10);
    System.out.println(numero);
    }
}