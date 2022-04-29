package ControlFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PersistenciaCliente{

    private ArrayList <Cliente> datos;

    public PersistenciaCliente(ArrayList<Cliente> datos) {
        this.datos = datos;
    }

    public void write() throws IOException{

        String ruta = "Controles/ControlFicheros/clientes.dat";
        File fichero = new File(ruta);
        FileWriter ficheroWrite = new FileWriter(fichero);
        try (PrintWriter archivo = new PrintWriter(ficheroWrite)) {
            for (int i = 0; i < datos.size(); i++) {
                archivo.print(datos.get(i));   
            }
            archivo.close();
        }
    }
}