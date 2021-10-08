import java.util.Scanner;
public class Ejemplo16 {
	public static void main(String args[]){
       //Declaración de variables
        int suma;
        int resta;
        int multiplicacion;
        int division;
        byte opcion;
        short x;
        short y;
        Scanner inputValue = new Scanner(System.in);

        //Empieza el programa
        System.out.println("Introduce el numero x");
        x = inputValue.nextShort();
        System.out.println("Introduce el numero y");
        y = inputValue.nextShort();
        System.out.println("+ (1), - (2), * (3), / (4)");
        opcion = inputValue.nextByte();
        inputValue.close();

        suma = x + y;
        resta = x - y;
        multiplicacion = x * y;
        division = x / y;

        if(opcion == 1){
            System.out.println(suma);
        }
        if(opcion == 2){
            System.out.println(resta);
        }
        if(opcion == 3){
            System.out.println(multiplicacion);
        }
        if(opcion == 4){
            System.out.println(division);
        }
    }
}