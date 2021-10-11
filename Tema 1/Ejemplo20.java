import java.util.Scanner;
public class Ejemplo20 {
    public static void main(String args[]){
       //Declaración de variables
       double precio;
       double precioDes;
       
       Scanner inputValue = new Scanner(System.in);
       //Empieza el programa
       System.out.println("Introduce el precio del producto");
       precio = inputValue.nextDouble();
       inputValue.close();

       if(precio<6){
           System.out.println("No hay descuento");
        }else{
            if((precio>=6)&&(precio<60)){
                precioDes = precio * 0.95;
                System.out.println("Se aplica un 5% de descuento:"+precioDes);
            }else{
            if(precio>=60){
                precioDes = precio * 0.90;
                System.out.println("Se aplica un 10% de descuento:"+precioDes);
                }
            }
        }
    }
}