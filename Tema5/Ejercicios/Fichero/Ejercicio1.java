package Ejercicios.Fichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException{

        System.out.println("Escribe la ruta: ");
        String entrada = new BufferedReader(new InputStreamReader(System.in)).readLine();

        File fichero = new File(entrada);
        
        System.out.println("Lista de ficheros y directorios del directorio: " + entrada);

        System.out.println("---------------------------------------------");
            for (String item : fichero.list()) {
                System.out.println(item);
            }
    }
}