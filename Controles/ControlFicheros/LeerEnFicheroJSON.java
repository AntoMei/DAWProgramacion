package ControlFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LeerEnFicheroJSON {
    public static void main(String[] args) throws FileNotFoundException {
        
        BufferedReader archivo = new BufferedReader(new FileReader("Controles/ControlFicheros/clientes.json"));
        Gson gson = new Gson();

        Type tipoListaClientes = new TypeToken<List<Cliente>>(){}.getType();
        List<Cliente> clientes = gson.fromJson(archivo, tipoListaClientes);
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }
}
/* private static void leerJSON() throws IOException{
        BufferedReader lector = new BufferedReader(new FileReader("Tema 6/ControlFicheros/Clientes.json"));
        Gson gson = new Gson();

        Type tipoListaClientes = new TypeToken<List<Cliente>>(){}.getType();
        List<Cliente> clientes = gson.fromJson(lector, tipoListaClientes);
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }*/