import java.util.Scanner;
public class Entrada {
    public static Integer getInteger(){
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Escribe un número:");

        if(entrada.hasNextInt()){
            int x = entrada.nextInt();
            System.out,println(""+x);
        }
        else {
            System.out.println("Introduce un valor entero:");
        }
        entrada.close();
    }
}