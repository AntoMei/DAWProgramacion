import java.util.Scanner;

public class MayorDeTres {
    public static void mayordetres(int a, int b, int c){
        if (a>b && a>=c){
            System.out.println(a);
        }else{
            if (b>a && b>=c){
                System.out.println(b);
            }else{
                if (c>a && c>=b){
                    System.out.println(c);
                }
            }
        }
    }
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        a = lector.nextInt();

        System.out.println("Introduzca el primer número:");
        b = lector.nextInt();

        System.out.println("Introduzca el primer número:");
        c = lector.nextInt();
        lector.close();

        mayordetres(a, b, c);
    }
}
