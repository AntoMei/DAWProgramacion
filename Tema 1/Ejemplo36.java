import java.util.Scanner;
public class Ejemplo36 {
    public static void main(String[] args) {
        int numeros[] = new int [10];
        int n;
        int mayor;
        Scanner lector = new Scanner (System.in);
      
        for (int i = 0; i < 10; i++){
            System.out.println("Ingresa un número:");
            n = lector.nextInt();
            if(numeros>mayor){
                mayor = numeros;
            }
        System.out.println("El maximo de los números es:"+maximo);
        }
    }
}