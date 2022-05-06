package ControlFicheros;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class EscribirEnFicheroJSON {
    public static void main(String[] args) throws IOException {
        
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("Controles/ControlFicheros/Clientes.obj"));
        
        Cliente c1;
        try{
        while (true) {
            c1 = (Cliente) archivo.readObject();
     
        final String cliente1JSON = "{\"id\":"+ c1.getId()+",\"nif\":\"1234354f\",\"nombre\":Antonio, \"apellidos\":Meirosu, \"email\":an@gmail.com}";
        final String cliente2JSON = "{\"id\":3,\"nif\":\"787934908f\",\"nombre\":Adrian, \"apellidos\":Mei, \"email\":anto@gmail.com}";
        final String cliente3JSON = "{\"id\":4,\"nif\":\"7098790832g\",\"nombre\":Anto, \"apellidos\":Meirosu, \"email\":an@gmail.com}";
        final String cliente4JSON = "{\"id\":6,\"nif\":\"1234354f\",\"nombre\":Antonio, \"apellidos\":Meirosu, \"email\":an@gmail.com}";

        final String clientesJSON = "[" + cliente1JSON + "," + cliente2JSON + "," + cliente3JSON + "," + cliente4JSON + "]";
        final Gson gson = new Gson();
        final Type tipoListaClientes = new TypeToken<List<Cliente>>(){}.getType();
        final List<Cliente> clientes = gson.fromJson(clientesJSON, tipoListaClientes);
        final Writer w_json = new FileWriter("Controles/ControlFicheros/clientes.json");

        final String representacionesJSON = gson.toJson(clientes);

        w_json.write(representacionesJSON);

        w_json.close();
    
    } 
