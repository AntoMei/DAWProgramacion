package Repaso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class PersistenciaCliente {

    public static ArrayList<Cliente> clientes;

    public PersistenciaCliente() {
        clientes = new ArrayList<>();
    }

    public void write() throws IOException{

        try {
 
            BufferedWriter archivo = new BufferedWriter(new FileWriter("Tema4/Repaso/clientes.dat"));
 
            for (Cliente e : clientes) {
                String cliente = e.getId() + ", " + e.getNif() + ", " + e.getNombre() + ", " + e.getApellidos() + ", " + e.getEmail() + "\n";
                archivo.write(cliente);
            }
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Cliente> read() throws IOException{

        ArrayList<Cliente> resultado = new ArrayList<>();

        FileReader ficheroLectura;
        BufferedReader lector;

        try {
            ficheroLectura = new FileReader("Tema4/Repaso/clientes.dat");
            lector = new BufferedReader(ficheroLectura);

            String linea;

            while ((linea = lector.readLine()) != null) {
                String [] trozos = linea.split(",");
                int idTrozeado = Integer.parseInt(trozos[0]);
                Cliente cliente = new Cliente(idTrozeado, trozos[1], trozos[2], trozos[3], trozos[4]);
                resultado.add(cliente);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return resultado;
    }
}