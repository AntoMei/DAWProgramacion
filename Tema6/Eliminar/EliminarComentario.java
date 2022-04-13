package Eliminar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EliminarComentario {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("Tema6/Eliminar/fichero.txt"));
        String linea = "";
        String inicio;
        int contador = 0;

        while ((linea = br.readLine()) != null) {
                linea = linea.replaceAll("\\s", "");

                if (linea.length() > 1) {
                    inicio = linea.substring(0, 2);
        
                if (inicio.equals("//")) {
                    contador++;
                }
            }
        }
        System.out.println(contador);
        br.close();
    }
}