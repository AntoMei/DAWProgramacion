import java.util.Scanner;
public class Ejemplo7 {
    public static void main (String argv[]) {
        double precio;
        double precioRebajado;
        double descuento;

        System.out.println("Introduce el precio real");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        precio = inputValue.nextDouble();

        System.out.println("Introduce el precio rebajado");
        Scanner inputValue2;
        inputValue2 = new Scanner(System.in);
        precioRebajado = inputValue2.nextDouble();

       descuento=(precio-precioRebajado)/precio*100;

        System.out.println("descuento:"+(precio-precioRebajado)/+precio*100);
        inputValue.close();
        inputValue2.close();

    }
}