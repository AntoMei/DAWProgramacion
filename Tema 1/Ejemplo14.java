import java.util.Scanner;
public class Ejemplo14 {
    public static void main (String argv[]) {

        int nota;
        
        System.out.println("Introduce la nota");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        nota = inputValue.nextInt();

        inputValue.close();

      if (nota==0 && nota<3){
      System.out.println("Muy deficiente");
      }
    }
  }
}

      


        

