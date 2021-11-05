package Controles.Control02;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double numero1; double numero2; double real; double decimal;

        System.out.println("Ingrese un numero:");
        numero1 = lector.nextDouble();
        
        decimal = numero1 % 1;
        real = numero1 -decimal;
        System.out.printf(""+decimal,real);

        System.out.println("Ingrese un numero:");
        numero2 = lector.nextDouble();
        decimal = numero2 % 1;
        real = numero2 -decimal;
        System.out.printf(""+decimal,real);
        lector.close();
    }
}