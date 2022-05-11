package ControlFicheros;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

public class LeerEnFicheroJSON {
    public static void main(String[] args) throws FileNotFoundException {
        
        final String c1 = "{\"1", "12345678a", "Antonio", "Meirosu", "antonio.meirosu@gmail.com"}";
        final Cliente c2 = new Cliente("2", "12345678b", "Ant", "Me", "anto.meirosu@gmail.com");
        final Gson gson = new Gson();
        final String cliente1 = gson.toJson(c1, Cliente.class);
        final String cliente2 = gson.toJson(c2, Cliente.class);

         
    }
    
}
