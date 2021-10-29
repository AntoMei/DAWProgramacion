import java.util.Scanner;
public class Entrada {
    public static int getInteger(){
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Escribe un número:");

        while(entrada.hasNext()){
            if (entrada.hasNextInt()){
                System.out.println("Entero:"+entrada.nextInt());
                System.out.println("No entero:"+entrada.next());
            }
            entrada.close();
        }
        return 0;
    }
}