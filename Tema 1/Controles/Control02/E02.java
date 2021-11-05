package Controles.Control02;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        double radio;
        double perimetro;
        double area;
        double lado;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        radio = lector.nextDouble();

        perimetro = lado = 2 * Math.PI * radio;
        area = Math.PI * radio * radio;
        System.out.println("Perimetro:"+perimetro);
        System.out.println("Area:"+area);
        lector.close();
    }
}
