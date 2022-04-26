package Eliminar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EliminarComentario {
    public static void main(String[] args) throws IOException {

      FileReader fichero = new FileReader("Tema6/Eliminar/Programa.java");

        BufferedReader br = new BufferedReader(fichero);
        
        PrintWriter escritor = new PrintWriter("Tema 6/Eliminar/ProgramaResultado.java");

        String linea;
        String lineaSinEspacios;
        String inicio;

        while((linea = br.readLine())!= null){

            lineaSinEspacios = linea.replaceAll("\\s","");

            if(lineaSinEspacios.length() > 0){

                if(lineaSinEspacios.length() == 1){
                    escritor.println(linea);
                }else{
                    inicio = lineaSinEspacios.substring(0, 2);
            
                    if(inicio.equals("//")){
                    }else{
                        escritor.println(linea);
                    }
                }
            }else{
                escritor.println("");
            }
            
        }

        escritor.close();
        fichero.close();
        br.close();
    }
}