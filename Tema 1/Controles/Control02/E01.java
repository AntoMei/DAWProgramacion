package Controles.Control02;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        short nombre = lector.nextShort();
        System.out.println("Hola Perico");
        lector.close();
    } 
}