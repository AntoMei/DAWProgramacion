package Controles;
import java.util.Scanner;
public class Control01 {
    public static void main(String[] args) {
        //Declaración de Variables
        int numero;
        Scanner inputValue = new Scanner (System.in);
        double perimetroTriangulo;
        double perimetroCuadrado;
        double londitud;

        //Empieza el programa
        System.out.println("Dime el numero de lados del polígono");
        numero = inputValue.nextInt();
        
        System.out.println("Dime la longitud del lado del polígono");
        londitud = inputValue.nextInt();
        
        inputValue.close();
        perimetroTriangulo = londitud * 3;
        perimetroCuadrado = londitud * 4;
        if (numero ==3){
        System.out.println("El perimetro del triangulo es:"+perimetroTriangulo);
        }else{
            System.out.println("Incorrecto");
        if (numero ==4){
        System.out.println("El perimetro del cuadrado es:"+perimetroCuadrado);
        }else{
            System.out.println("Incorrecto");
        }
    }
}
}