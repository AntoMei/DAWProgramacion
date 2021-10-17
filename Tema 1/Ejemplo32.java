import java.util.Scanner;
public class Ejemplo32 {
    public static void main(String[] args) {
        int num[] = new int[10];
        Scanner numero = new Scanner(System.in);
        
        for(int i = 0; i < num.length; i++){
            System.out.println("Introcude un número:");
            num[i]=numero.nextInt();
        }
        System.out.println("Imprimiendo orden inverso:");
        numero.close();
            for (int i = num.length - 1; i >= 0; i--){
                System.out.println(+num[i]);
            }
        }
    }
