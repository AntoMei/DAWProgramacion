import java.util.Scanner;
public class plo7 {
    public static void main (String argv[]) {
        int precio;
        int preciorebajado;
        int descuento;

        System.out.println("Introduce el precio real");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        precio = inputValue.nextInt();

        System.out.println("Introduce el precio rebajado");
        Scanner inputValue2;
        inputValue = new Scanner(System.in);
        preciorebajado = inputValue2.nextInt();

        descuento = (precio-preciorebajado)/precio * 100;

     

        
        
