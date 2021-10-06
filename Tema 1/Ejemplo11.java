import java.util.Scanner;
public class Ejemplo11 {
    public static void main (String argv[]) {
        //Decalración de variables
        double x,y;  
        Scanner inputValue = new Scanner(System.in);

        //Empieza el programa
        
        System.out.println("Introduce el valor 1");
        x = inputValue.nextDouble();

        System.out.println("Introduce el valor 2");
        y = inputValue.nextDouble();
        
        inputValue.close();

        if(x <= y) {
            System.out.println(x+" "+y);
        }
        else{
            System.out.println(y+" "+x);
           }
        }
    }