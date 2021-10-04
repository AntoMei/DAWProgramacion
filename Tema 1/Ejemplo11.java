import java.util.Scanner;
public class Ejemplo11 {
    public static void main (String argv[]) {
        int valor1;
        int valor2;

        System.out.println("Introduce el valor 1");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        valor1 = inputValue.nextInt();

        System.out.println("Introduce el valor 2");
        Scanner inputValue1;
        inputValue1 = new Scanner(System.in);
        valor2 = inputValue1.nextInt();
        
       
        if (valor1>valor2){
            System.out.println("Orden Ascendente:"+valor1+""+valor2);
   }
        inputValue.close();
        inputValue1.close();
        
        
    }
}

