import java.util.Scanner;
public class Ejemplo7 {
	public static void main(String args[]){
        //Declaración de variables
        double precio;
        double precioRebajado;
        double descuento;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Introduce el precio real");
        precio = inputValue.nextDouble();

        System.out.println("Introduce el precio rebajado");
        
        precioRebajado = inputValue.nextDouble();
        inputValue.close();
        descuento=(precio-precioRebajado)/precio*100;

        System.out.println("descuento:"+descuento); 

    }
}