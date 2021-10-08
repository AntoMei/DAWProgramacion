import java.util.Scanner;
public class Ejemplo12 {
	public static void main(String args[]){
        //Declaración de variables
        double x,y;
        Scanner inputValue = new Scanner(System.in);

        //Empieza el programa
       
        System.out.println("Introduce el valor 1");
        x = inputValue.nextDouble();

        System.out.println("Introduce el valor 2");
        y = inputValue.nextDouble();
        inputValue.close();
        if(x>y) {
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }
    }
}