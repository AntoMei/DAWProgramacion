import java.util.Scanner;
public class Ejemplo25 {
    public static void main(String args[]){
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduzca su factorial");
        int x = inputValue.nextInt();
        System.out.println(factorial(x));
        inputValue.close();
    }
    public static int factorial(int numero){
        int resultado = 1;
        for (int i =1; i <= numero; i++){
            resultado *=i;
        }
        return resultado;
    }
}