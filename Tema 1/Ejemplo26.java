import java.util.Scanner;
public class Ejemplo26 {
    public static void main(String args[]){
        Scanner inputValue = new Scanner(System.in);
        int numero;

        System.out.println("Introduce el número");
        numero = inputValue.nextInt();
        inputValue.close();
        System.out.println("Tabla del"+numero);
        for (int i = 1; i<=10; i++){
            System.out.println(numero+"*"+i+"="+numero*i);
        }
    }
}