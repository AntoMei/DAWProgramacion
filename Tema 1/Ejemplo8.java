import java.util.Scanner;
public class Ejemplo8 {
    public static void main(String args[]){
        
        //Declaración de variables
        short edad = 0; 
        Scanner inputValue =  new Scanner(System.in);

        //Empieza el proceso
        
        System.out.println("Introduce la edad");
       
        edad = inputValue.nextShort();
        inputValue.close();
        if (edad >= 18){
            System.out.println("Mayor de edad");
        }
    }
}