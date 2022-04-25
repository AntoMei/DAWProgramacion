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

        PrintWriter ficheroMezcla = new PrintWriter("Tema6/Mezcla/ficheroMezcla");

        //Para los dos archivos.

        BufferedReader lectorPrimerFichero = new BufferedReader(new FileReader("Tema6/Mezcla/fichero1.txt"));
        BufferedReader lectorSegundoFichero = new BufferedReader(new FileReader("Tema6/Mezcla/fichero2.txt"));

        String lineaPrimerFichero = lectorPrimerFichero.readLine();
        String lineaSegundoFichero = lectorSegundoFichero.readLine();

        //Para copiar las lineas del fichero1 y fichero2 al fichero

        while (lineaPrimerFichero != null || lineaSegundoFichero != null) {

            if (lineaPrimerFichero != null) {
                ficheroMezcla.println(lineaPrimerFichero);
                lineaPrimerFichero = lectorPrimerFichero.readLine();
            }
            
            if (lineaSegundoFichero != null) {
                ficheroMezcla.println(lineaSegundoFichero);
                lineaSegundoFichero = lectorSegundoFichero.readLine();
                
            }
        }

        //Vacía el escritorio.
        
        ficheroMezcla.flush();

        //Cerrar br y pw
        lector.close();
        lectorPrimerFichero.close();
        lectorSegundoFichero.close();
        ficheroMezcla.close();

        System.out.println("Se ha creado correctamente el ficheroMezcla.");
        
    }
}