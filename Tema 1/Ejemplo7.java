import java.util.Scanner;
public class Ejemplo7 {
    public static void main (String argv[]) {
        double precio;
        double preciorebajado;
        double descuento;

        System.out.println("Introduce el precio real");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        precio = inputValue.nextDouble();

        System.out.println("Introduce el precio rebajado");
        Scanner inputValue2;
        inputValue2 = new Scanner(System.in);
        preciorebajado = inputValue2.nextDouble();

        System.out.println("descuento:"+(precio-preciorebajado)/precio);
        
    }
}