import java.util.Scanner;

public class Mayor {
    public static void mayor(int numero){
        
        if (numero>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
    }
    public static void main(String[] args) {
        int edad;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca su edad:");
        edad = lector.nextInt();
        lector.close();
        mayor(edad);
       

    }
}