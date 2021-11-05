package Controles.Control02;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        double notaCertamen; double notaCertamen1; double notaCertamen2; double notaLaboratorio; double notaFinal;
        double promedioRamo; double notaCertamen3;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese nota certamen 1:");
        notaCertamen1 = lector.nextDouble();

        System.out.println("Ingrese nota certamen 2:");
        notaCertamen2 = lector.nextDouble();

        System.out.println("Ingrese nota certamen 2:");
        notaCertamen3 = lector.nextDouble();
        
        System.out.println("Ingrese nota certamen:");
        notaLaboratorio = lector.nextDouble();

        promedioRamo = 
        notaCertamen = (notaCertamen1 + notaCertamen2 + notaCertamen3) / 3;
        notaFinal = (notaCertamen * 0.7) + (notaLaboratorio * 0.3);
        System.out.println(+);
    }
}