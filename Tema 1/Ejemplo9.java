import java.util.Scanner;
public class Ejemplo9 {
    public static void main (String argv[]) {
      //Declaración de variables
      short edad = 0; 
      Scanner inputValue =  new Scanner(System.in);
       
      //Empieza el proceso
        
      System.out.println("Introduce la edad");
     
      edad = inputValue.nextShort();
        
      if (edad >= 18){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
            inputValue.close();
        }
    }
}