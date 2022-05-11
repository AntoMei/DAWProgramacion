package ControlFicheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscribirEnFicheroJSON {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("Controles/ControlFicheros/clientes.json"));
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        for(Cliente cliente: PersistenciaCliente.clientes){
            String imprimirGson = gson.toJson(cliente);
            archivo.writeUTF(imprimirGson);
        }
        archivo.close();
    }   
} 