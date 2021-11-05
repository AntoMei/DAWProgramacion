package Controles.Control02;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double catetoA; double catetoB; double hipotenusa;
        double sumaCatetos;


        System.out.println("Ingrese cateto a:");
        catetoA = lector.nextDouble();

        System.out.println("Ingrese cateto b:");
        catetoB = lector.nextDouble();

        catetoA = catetoA * catetoA;
        catetoB = catetoB * catetoB;
        sumaCatetos = catetoA + catetoB;
        hipotenusa = Math.sqrt(sumaCatetos);

        System.out.println("La hipotenusa es"+hipotenusa);
        lector.close();
    }
}