import java.util.Scanner;
public class Ejemplo10 {
	public static void main(String args[]){
        //Declaración de variables
        double valor;
        Scanner inputValue = new Scanner(System.in);
       
        //Empieza el proceso 

        System.out.println("Introduce el numero");
        valor = inputValue.nextDouble();
        inputValue.close();
        if (valor >=0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo"); 
        }
    }
}