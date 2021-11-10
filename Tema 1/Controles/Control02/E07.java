package Controles.Control02;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        int horasActual; int horasCantidad; int resultado;

        Scanner lector = new Scanner(System.in);

        System.out.println("Hora actual:");
        horasActual = lector.nextInt();
        System.out.println("Cantidad horas:");
        horasCantidad = lector.nextInt();
        resultado = (horasActual + horasCantidad) / 12;

        System.out.print("En"+horasCantidad+",el reloj marcara las"+resultado);
        lector.close();
    }
}