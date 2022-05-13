package ControlFicheros;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscribirEnFicheroJSON {
    public static void main(String[] args) throws IOException {

        PrintWriter archivo = new PrintWriter("Controles/ControlFicheros/clientes.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        archivo.write("[");

        for (int i = 0; i < PersistenciaCliente.clientes.size(); i++) {
            if (i != PersistenciaCliente.clientes.size()-1) {
                String imprimir = gson.toJson(PersistenciaCliente.clientes.get(i));
                archivo.write(imprimir + ",");
            }else{
                String imprimirGson = gson.toJson(PersistenciaCliente.clientes.get(i));
                archivo.write(imprimirGson);
            }
        }
        archivo.write("]");
        archivo.close();
    }
}