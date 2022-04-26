package Eliminar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EliminarComentario {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("Tema6/Eliminar/fichero.txt"));
        PrintWriter pw = new PrintWriter(("Tema6/Eliminar/fichero2.txt"));

        String linea = "";
        String liniaSinEspacios;
        String inicio;

        while ((linea = br.readLine()) != null) {
                liniaSinEspacios = linea.replaceAll("\\s", "");

                if (liniaSinEspacios.length() > 0) {

                  if (liniaSinEspacios.length() == 1){
                    pw.println(linea);
                  }else{
                      inicio = liniaSinEspacios.substring(0, 2);

                      if (inicio.equals("//")) {
                      }else{
                        pw.println(linea);
                      }
                    }
                  }else{
                    pw.println("");
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}