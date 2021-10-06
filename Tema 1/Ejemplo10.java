import java.util.Scanner;
public class Ejemplo10 {
    public static void main (String argv[]) {
        //Declaración de variables
        short valor;
        Scanner inputValue = new Scanner(System.in);
       
        //Empieza el proceso 

        System.out.println("Introduce el numero");
        valor = inputValue.nextShort();
        inputValue.close();
        if (valor >=0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo"); 
        }
    }
}