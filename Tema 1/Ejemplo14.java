import java.util.Scanner;
public class Ejemplo14 {
    public static void main (String argv[]) {
      //Declaración de variables
      double nota;
      Scanner inputValue = new Scanner(System.in);
        
      //Empieza el programa

      System.out.println("Introduce la nota");
      nota = inputValue.nextDouble();

      inputValue.close();
      if (nota ==0 && nota <3){
        System.out.println("Muy deficiente");

      if(nota == 3 && nota <5){
          System.out.println("Insuficiente");
        }
      }
    }
  }