package ControlFicheros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CrearObjetosCliente {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("Controles/ControlFicheros/Clientes.obj"));

        String[] id = {"2","3","4","6"};
        String[] nif = {"1234354f","787934908f","7098790832g","09903785h"};
        String[] nombre = {"Antonio", "Adrian", "Anto", "Adri"};
        String[] apellidos = {"Meirosu", "Mei", "Me", "Meiro"};
        String[] email = {"an@gmail.com", "anto@gmail.com", "anton@gmail.com", "antonio@gmail.com"};

        Cliente c1;

        for (int i = 0; i < 4; i++) {
            c1 = new Cliente(id[i],nif[i],nombre[i],apellidos[i],email[i]);
            archivo.writeObject(c1);
            
        }
        archivo.close();   
    }
}