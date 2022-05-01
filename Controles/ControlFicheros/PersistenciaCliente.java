package ControlFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class PersistenciaCliente implements Serializable{

     ArrayList <Cliente> datos;

    public PersistenciaCliente(){
      datos = new ArrayList<>();
    }

    public void write() throws IOException{

        try {
          BufferedWriter archivo = new BufferedWriter(new FileWriter("Controles/ControlFicheros/clientes.dat"));

          for (Cliente item : datos) {
            String cliente = 
            "Id " + item.getId() + ", Nif " + item.getNif() + ", Nombre " + item.getNombre() + ", Apellidos " + item.getApellidos() + "email " + item.getEmail() + "\n";
            archivo.write(cliente);
          }
          archivo.close();
        } catch (Exception e) {
         System.out.println(e.getMessage());
        }
      }

    public void read() throws IOException{

       String file = "Controles/ControlFicheros/clientes.dat";

       try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
        }
       } catch (Exception e) {
          System.out.println("Error");
          e.printStackTrace();
  }
    }
  }