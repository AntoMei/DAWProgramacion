package Controles;
import java.util.Scanner;
public class Control01corrección {
    public static void main(String[] args) {
        //Declaración de Variables
        int numeroLados;
        Scanner inputValue = new Scanner (System.in);
        double longitudLado = 0;
        double perimetro;
    
        System.out.println("Dime el numero de lados del polígono");
        numeroLados = inputValue.nextInt();

        if (numeroLados ==3 || numeroLados ==4){
            System.out.println("Dime la longitud del lado del polígono");

        longitudLado = inputValue.nextDouble();
        inputValue.close();
        perimetro = numeroLados * longitudLado;

        switch(numeroLados){
            case 3 :
            System.out.println("El perimetro del triángulo es:"+perimetro);
            break;
            case 4 :
            System.out.println("El perimetro del cuadrado es:"+perimetro);
            default:
            break;
        }
    }
}
}