import java.util.Scanner;
public class Ejemplo17 {
    public static void main (String argv[]) {
       //Declaración de variables
       int mes;
       Scanner inputValue = new Scanner(System.in);

       //Empieza el programa
       System.out.println("Introduce el mes");
       mes = inputValue.nextInt();
       inputValue.close();

       switch(mes){
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
            System.out.println("31 dias");
            break;
            case 2:
            System.out.println("28 días");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("30 días");
       }
    }
}