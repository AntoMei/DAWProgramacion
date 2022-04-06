package Mezcla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Mezcla {
    public static void main(String[] args) throws IOException {

        //Pedir por consola los dos nombres de los ficheros.

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el nombre del primer fichero :");
        lector.nextLine();

        System.out.println("Introduce el nombre del segundo fichero :");
        lector.nextLine();

        //Para imprimir los dos archivos en uno final.

        PrintWriter pw = new PrintWriter("Tema6/Mezcla/ficheroMezcla");

        //Para los dos archivos.

        BufferedReader br1 = new BufferedReader(new FileReader("Tema6/Mezcla/fichero1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("Tema6/Mezcla/fichero2.txt"));

        String line1 = br1.readLine();
        String line2 = br2.readLine();

        //Para copiar las lineas del fichero1 y fichero2 al fichero3

        while (line1 != null || line2 != null) {

            if (line1 != null) {
                pw.println(line1);
                line1 = br1.readLine();
            }
            
            if (line2 != null) {
                pw.println(line2);
                line2 = br2.readLine();
                
            }
        }

        pw.flush();

        //Cerrar br y pw
        lector.close();
        br1.close();
        br2.close();
        pw.close();

        System.out.println("Se ha creado correctamente el ficheroMezcla.");
        
    }
}