package EstadisticasTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EstadisticaTexto {

    public void contarLetras(){
        BufferedReader fichero = new BufferedReader(new FileReader("Tema6/EstadisticasTexto/fichero.txt"));
        
            
    public void contarPalabra(){
        int contador = 0;
        try {
        
            BufferedReader fichero = new BufferedReader(new FileReader("Tema6/EstadisticasTexto/fichero.txt"));
            String linea = fichero.readLine();
            while (linea != null) {
                String [] palabras = linea.split(" ");
                contador += palabras.length;
                linea = fichero.readLine();
            }
            fichero.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("\nPalabras contadas: " + contador);
    }
    public static void main(String[] args) {
        EstadisticaTexto e1 = new EstadisticaTexto();
        e1.contarPalabra();
    }
}  