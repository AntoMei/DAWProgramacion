import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena1 = teclado.nextLine();
        String cadena2 = teclado.nextLine();

        String todo = cadena1 + cadena2;

        for (int i = todo.length() -1 ; i>= 0; i--) {
            System.out.println(todo.charAt(i));
            
        }
        teclado.close();
    }
    
}