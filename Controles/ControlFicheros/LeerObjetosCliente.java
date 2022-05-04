package ControlFicheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerObjetosCliente {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("Controles/ControlFicheros/Clientes.obj"));
    
        Cliente c1;
        try {
            while (true) {
                c1 = (Cliente) archivo.readObject();
                System.out.println("Id: " + c1.getId());
                System.out.println("Nif: " + c1.getNif());
                System.out.println("Nombre: " + c1.getNombre());
                System.out.println("Apellidos: " + c1.getApellidos());
                System.out.println("Email: " + c1.getEmail());
                System.out.println();    
            }

        } catch (Exception e) {
            archivo.close();
        }
    } 
}