package ControlFicheros;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.google.gson.Gson;

public class EscribirEnFicheroJSON {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("Controles/ControlFicheros/Clientes.obj"));
        final Cliente cliente = new Cliente("2", "948i9084", "Antonio", "Meirosu", "antonio.meirosu@gmial.com");
        final Gson gson = new Gson();
        final String representacionesJSON = gson.toJson(cliente);
        System.out.println(representacionesJSON);
    }   
} 