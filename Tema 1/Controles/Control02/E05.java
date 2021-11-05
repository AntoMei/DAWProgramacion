package Controles.Control02;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        int numero; int numero1; int numero2; int numero3;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese numero:");
        numero = lector.nextInt();
        numero1 =numero%10;
        numero2=numero/10%10;
        numero3=numero/100;

        System.out.println(numero3+numero2*10+numero1*100);

        System.out.println("Ingrese numero:");
        numero = lector.nextInt();

        numero1 =numero%10;
        numero2=numero/10%10;
        numero3=numero/100;

        System.out.println(numero3+numero2*10+numero1*100);
        lector.close();
    }
}
