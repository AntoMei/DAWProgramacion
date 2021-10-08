import java.util.Scanner;
public class Ejemplo14 {
	public static void main(String args[]){
      //Declaración de variables
      byte nota = 0;
      Scanner inputValue = new Scanner(System.in);

      //Empieza el programa

      System.out.println("Introduce la nota");
      nota = inputValue.nextByte();
      inputValue.close();
      if (nota<=0){
      }else{
          if(nota<3){
        System.out.println("Muy Deficiente");
          }
        }
      }
    }