package Controles.Control02;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        
        double nota1; 
        double nota2; 
        double nota3; 
        double nota4;
        Scanner lector = new Scanner(System.in);

        System.out.println("Primera nota:");
        nota1 = lector.nextDouble();
        System.out.println("Segunda nota:");
        nota2 = lector.nextDouble();
        System.out.println("Tercera nota:");
        nota3 = lector.nextDouble();
        System.out.println("Cuarta nota:");
        nota4 = lector.nextDouble();
        
        double promedio = (nota1+nota2+nota3+nota4) / 4;
        System.out.println("El promedio es:"+promedio);
        lector.close();
    }
}