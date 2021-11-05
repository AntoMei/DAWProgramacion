package Controles.Control02;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double catetoA; double catetoB; double hipotenusa;


        System.out.println("Ingrese cateto a:");
        catetoA = lector.nextDouble();

        System.out.println("Ingrese cateto b:");
        catetoB = lector.nextDouble();

        hipotenusa = Math.sqrt (Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        System.out.println("La hipotenusa es"+hipotenusa);
        lector.close();
    }
}