package Eliminar;

import java.io.FileReader;
import java.io.IOException;

public class EliminarTodoComentario {

  public static void main(String[] args) throws IOException{
    
     FileReader archivo = new FileReader("Tema6/Eliminar/ficheroTodo.txt");
        BufferedReader lector = new BufferedReader(archivo);
        PrintWriter escritor = new PrintWriter("Tema 6/EliminarComentarios_v2/PruebaSinComentarios.java");

        String linea;
        String lineaSinEspacios;
        String principioDeLinea;
        String comentariosJavaDoc;
  }
