import java.util.Scanner;
public class Ejemplo21 {
    public static void main(String args[]){
       //Declaración de variables
       int año;
       Scanner inputValue = new Scanner(System.in);

       //Empieza el programa
       System.out.println("Introduce el año");
       año = inputValue.nextInt();
       inputValue.close();

       if ((año%4==0) ||(año%100!=0 && año%400!=0)){
        System.out.println("El año"+año+"es bisiesto");
       }else{
           System.out.println("El año"+año+"no es bisiesto");
       }
    }
}