import java.util.Scanner;
public class Ejemplo15 {
	public static void main(String args[]){
       //Declaración de variables
        short numero;
        Scanner inputValue = new Scanner(System.in);

        //Empieza el programa
        System.out.println("Introduce el numero y leelo");
        numero = inputValue.nextShort();
        inputValue.close();
        if (numero ==1){
            System.out.println("Uno");
        }
        if(numero==2){
            System.out.println("Dos");
        }
        if(numero==3){
            System.out.println("Tres");
        }
        if(numero==4){
            System.out.println("Cuatro");
        }
        if(numero==5){
            System.out.println("Cinco");
        }
        if(numero==6){
            System.out.println("Seis");
        }
        if(numero==7){
            System.out.println("Siete");
        }
        if(numero==8){
            System.out.println("Ocho");
        } 
        if(numero==9){
            System.out.println("Nueve");
        }
        if(numero==10){
            System.out.println("Diez");
        }
    }
}