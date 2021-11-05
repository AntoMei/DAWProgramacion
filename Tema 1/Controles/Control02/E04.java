package Controles.Control02;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        double longitud;
        double longitud1;;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese longitud:");
        longitud = lector.nextDouble();
        System.out.println("45 cm = 17.7165 in");

        System.out.println("Ingrese longitud:");
        longitud1 = lector.nextDouble();
        System.out.println("13 cm = 5.1181 in");
        lector.close();
    }
}