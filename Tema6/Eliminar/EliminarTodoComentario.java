package Eliminar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EliminarTodoComentario {
  public static void main(String[] args) throws IOException{
    
        FileReader fichero= new FileReader("Tema6/Eliminar/ProgramaTodo.java");

        BufferedReader br = new BufferedReader(fichero);
        
        PrintWriter pw = new PrintWriter("Tema 6/Eliminar/ProgramaTodoResultado");

        String linea;
        String lineaSinEspacios;
        String inicio;
        String comentarios;

        while ((linea = br.readLine()) != null) {
          lineaSinEspacios = linea.replaceAll("\\s","");

           if(lineaSinEspacios.length() > 0){

                if(lineaSinEspacios.length() == 1){
                    if(lineaSinEspacios.equals("*")){
                    }else{
                        pw.println(linea);
                    }
                }else{
                    comentarios = lineaSinEspacios.substring(0, 1);
                    inicio = lineaSinEspacios.substring(0, 2);
            
                    if(comentarios.equals("*")){
                    }else if(inicio.equals("//")){
                    }else if(inicio.equals("/*")){
                    }else if(inicio.equals("*/")){   
                    }else{
                        pw.println(linea);
                    }
                }
            }else{
                pw.println("");
            }
            
        }

        pw.close();
        fichero.close();
        br.close();
    }
}