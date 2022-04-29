package EstadisticasTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EstadisticaTexto {

    double contadorLetras = 0;
    double contadorLineas = 0;
    double contadorVocales = 0;

    public void contarLetras() throws IOException{
    
        try (BufferedReader fichero = new BufferedReader(new FileReader("Tema6/EstadisticasTexto/fichero.txt"))) {
            String line;

            while ((line = fichero.readLine()) != null) {
                if (line.equals("")) {
                    System.out.println("Nada");
                }else{
                    contadorLetras += line.length();
                }
            }
            System.out.println("Número de letras :" +contadorLetras);
        }
    }
      
    public void contarPalabra(){
        int contadorPalabras = 0;
        try {
        
            BufferedReader fichero = new BufferedReader(new FileReader("Tema6/EstadisticasTexto/fichero.txt"));
            String linea = fichero.readLine();
            while (linea != null) {
                String [] palabras = linea.split(" ");
                contadorPalabras += palabras.length;
                linea = fichero.readLine();
            }
            fichero.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Número de palabras: " + contadorPalabras);
    }

    public void contarLineas() throws IOException{

        try (BufferedReader fichero = new BufferedReader(new FileReader("Tema6/EstadisticasTexto/fichero.txt"))) {
            String cadena;

            while ((cadena= fichero.readLine()) != null) {
               contadorLineas++;
            }
            System.out.println("Número de lineas :" +contadorLineas);
        }
    }

    public void contarVocales() throws IOException{

        BufferedReader fichero = new BufferedReader(new FileReader("Tema6/EstadisticasTexto/fichero.txt"));
        String linea = fichero.readLine();
        char [] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char [] charLine = linea.toCharArray();
        while (linea != null) {
        for (int i = 0; i < charLine.length; i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (charLine[i]==vocales[j]) {
                    contadorVocales++;
                }
            }
        }
        linea = fichero.readLine();
    }
    System.out.println("Numero de vocales :" + contadorVocales);
}
    
    public void porcentajesVocales(){
        double contadorPorcentajes = 0;
        contadorPorcentajes = (contadorVocales * 100.00) / contadorLetras;
        System.out.println("% de vocales : " + contadorPorcentajes);

    }

    public static void main(String[] args) throws IOException {
        EstadisticaTexto e1 = new EstadisticaTexto();
        e1.contarLetras();
        e1.contarPalabra();
        e1.contarLineas();
        e1.contarVocales();
        e1.porcentajesVocales();
    }
}  