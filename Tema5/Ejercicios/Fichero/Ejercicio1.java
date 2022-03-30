package Ejercicios.Fichero;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
        
    public static void root(){
        
        File fichero = File.listRoots()[0]; 
        File contenido[] = fichero.listFiles();
        
        int contador = 1;

        System.out.println("Lista de ficheros y directorios del directorio: ");          
        System.out.println("---------------------------------------------");
        
        if (fichero.getParent() != null) {
            System.out.println(fichero.getParent());
        }else{
            System.out.println("0.- Directorio Padre");
        }

        for (int j = 0; j < contenido.length; j++) {
            if (contenido[j].isDirectory()) {
                System.out.println(contador + ".- " + contenido[j] + " <Directorio>");
            }else if (contenido[j].isFile()) {
                System.out.println(contador + ".- " + contenido[j] + " " + contenido[j].length() + " bytes");
            }
            contador++;
        }
    }

    public static void main(String[] args) throws IOException{ 

        Scanner teclado = new Scanner(System.in);

        int opcion;

        System.out.println("Lista de ficheros y directorios del directorio: ");          
        System.out.println("---------------------------------------------");
        root();
        System.out.println("Introduce una opcion (-1 para salir): ");
        opcion = teclado.nextInt(); 
    }
}