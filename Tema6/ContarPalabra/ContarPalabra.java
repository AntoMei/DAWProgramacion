package ContarPalabra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ContarPalabra {
    public static void main(String[] args) {

        try {
            Scanner lector = new Scanner(System.in);

            System.out.println("Escribe el nombre del fichero: ");
            lector.nextLine();
            System.out.println("Escribe la palabra a buscar: ");
            BufferedReader br = new BufferedReader(new FileReader("Tema6/ContarPalabra/fichero.txt"));
            String palabra = lector.nextLine();
            String linea = "";
            int i = 0;
            int repeticiones = 0;

            while ((linea = br.readLine()) != null) {

                while ((i = linea.indexOf(palabra)) != -1) {
                    linea = linea.substring(i + palabra.length(), linea.length());
                    repeticiones++;
                }
            }
            lector.close();
            br.close();

            System.out.println("La palabra " + palabra + " aparece " + repeticiones + " veces en el fichero.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}   