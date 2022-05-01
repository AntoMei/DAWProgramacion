package ControlFicheros;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        
        Cliente c1 = new Cliente(4, "1234a", "Antonio", "Meirosu", "antonio.meirosu@gmail.com");
        
        System.out.println(c1.toString());

        Persona p1 = new Persona("12345678", "Antonio", "Meirosu");

        p1.toString();

        PersistenciaCliente pc1 = new PersistenciaCliente();

        pc1.datos.add(c1);

        pc1.write();
        pc1.read();
    } 
}