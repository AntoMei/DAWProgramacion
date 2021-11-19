import java.util.Scanner;

public class Descendente {
    public static void descendente(int x, int y){
        if(x<=y){
            System.out.println(x+" "+y);
         }
         else{
             System.out.println(y+" "+x);
         }
        }
    public static void main(String[] args) {
        int x; int y;

        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introduzca el primer número:");
        x = lector.nextInt();
        System.out.println("Introduzca el primer número:");
        y = lector.nextInt();
        lector.close();
        descendente(x, y);
    }
}