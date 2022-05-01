package ControlFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

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
       String linea;
       ArrayList<Cliente> lista = new ArrayList<>();

       System.out.println("Leyendo el fichero: " +file);

       try (Scanner teclado = new Scanner(new File(file))){

         while (teclado.hasNextLine()) {

          linea = teclado.nextLine();
          lista.add(linea);
          for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
          }
         }
       } catch (Exception e) {
         System.out.println(e.getMessage());
       }
      }
    }
    
          /* try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
        }
       } catch (Exception e) {
          System.out.println("Error");
          e.printStackTrace();*/
