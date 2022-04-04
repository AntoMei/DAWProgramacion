package Fichero;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

    private static void imprimirFichero(File e, int id) {

        String permisos = "";
        DateFormat formatter;
        formatter =  DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());

        if (e.isDirectory() != false) {
            permisos = "d";
        }else{
            permisos = "-";
        }

        if (e.canRead() != false) {
            permisos += "r";
        }else{
            permisos += "-";
        }

        if (e.canWrite() != false) {
            permisos += "w";
        }else{
            permisos += '-';
        }

        if (e.canExecute() != false) {
            permisos += "x";
        }else{
            permisos += '-';
        }

       //No imprime los ficheros/directorios ocultos

       if (!e.isHidden()) {
        if (e.isFile()) {
            System.out.println(id + ".- " + permisos + "\t" +  String.format("%-15d", e.length()) + formatter.format(e.lastModified()) + "\t" + e.getName());
        }
        if (e.isDirectory()){
            System.out.println(id + ".- " + permisos + "\t" +  String.format("%-15d", e.length()) + formatter.format(e.lastModified()) + "\t" + e.getName());
        }
    }
    }

   private static void imprimirDirectorio(File f) throws IOException {

        int contador = 1;

        if (f.exists()) {
            if (f.isDirectory()) {
                System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());
                System.out.println("---------------------------------------------------");

                if (f.getParent() != null) {
                    System.out.println("0.- Directorio padre"); 
                }
                
                for (File e : f.listFiles()){
                    imprimirFichero(e, contador);
                    contador++;
                }
            } else {
                System.out.println("No es un directorio");
            }

        } else {
            System.out.println("No existe el directorio");
        }
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        String entradaUsuario = "";
        int resultado = 0;
    
        System.out.println("Introduce una opcion (-1 para salir):");
    
        entradaUsuario = teclado.nextLine();
    
        resultado = Integer.parseInt(entradaUsuario); //Posible error en parse.
    
        return resultado;
    }

    public static void main(String[] args) throws IOException {

        File actualFile  = File.listRoots()[0]; //Empezamos con el fichero raíz.
        int opcion;

        do {
            imprimirDirectorio(actualFile);
            opcion = leerOpcion();

            if (opcion >= 1 && opcion <= actualFile.list().length) {

                File nextFile = actualFile.listFiles()[opcion-1];

                if (nextFile.isDirectory() && nextFile.canRead()) {
                    actualFile = nextFile;
                    }
                }
            else if (actualFile.getParent() != null && opcion  == 0){
                actualFile = actualFile.getParentFile();
            }
        } while (opcion != -1);
    }
}