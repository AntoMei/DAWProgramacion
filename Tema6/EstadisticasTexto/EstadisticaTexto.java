package EstadisticasTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EstadisticaTexto {

    public void contarLetras() throws IOException{
    
        BufferedReader fichero = new BufferedReader(new FileReader("Tema6/EstadisticasTexto/fichero.txt"));

        String line;
        int letras = 0;

        while ((line = fichero.readLine()) != null) {
            if (line.equals("")) {
                System.out.println("Nada");
            }else{
                letras += line.length();
            }
        }
        System.out.println("Número de letras :" +letras);
    }
      
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
        System.out.println("Palabras contadas: " + contador);
    }
    public static void main(String[] args) throws IOException {
        EstadisticaTexto e1 = new EstadisticaTexto();
        e1.contarLetras();
        e1.contarPalabra();
    }
}  