import java.util.Scanner;

public class Ejemplo40 {
    public static void main(String[] args) {
        int numero;
        Scanner lector = new Scanner(System.in);
        int f = 0;
        int t1 = 1;
        int t2;
        System.out.println("Cuantos números desea generar:");
        numero = lector.nextInt();

        for (int i = 1; i <= 40; i++) {
            t2 = f;
            f = t1 + f;
            t1 = t2;
            System.out.println(t1);
        }
    }
}