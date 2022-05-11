package ControlFicheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscribirEnFicheroJSON {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("Controles/ControlFicheros/clientes.json"));
        final Cliente c1 = new Cliente("1", "12345678a", "Antonio", "Meirosu", "antonio.meirosu@gmail.com");
        final Cliente c2 = new Cliente("2", "12345678b", "Ant", "Me", "anto.meirosu@gmail.com");
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        final String imprimir1 = gson.toJson(c1);
        final String imprimir2 = gson.toJson(c2);
        archivo.writeUTF(imprimir1);
        archivo.writeUTF(imprimir2);
        archivo.close();
    }  
}