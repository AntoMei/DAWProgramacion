package Controles.Control02;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        int horasActual; int horasCantidad;

        Scanner lector = new Scanner(System.in);

        System.out.println("Hora actual:");
        horasActual = lector.nextInt();
        System.out.println("Cantidad horas:");
        horasCantidad = lector.nextInt();

        System.out.println("En 5 horas, el reloj marcara las 8");

        System.out.println ("Hora actual:");
        horasActual = lector.nextInt();
        System.out.println("Cantidad horas:");
        horasCantidad = lector.nextInt();

        System.out.println("En 43 horas, el reloj marcara las 6");

        lector.close();
    }
}