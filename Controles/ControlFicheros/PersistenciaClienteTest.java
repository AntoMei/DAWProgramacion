package ControlFicheros;

import java.io.IOException;
import java.util.ArrayList;

public class PersistenciaClienteTest {
    public static void main(String[] args) throws IOException {
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        Cliente c1 = new Cliente("4", "12345678a", "Antonio", "Meirosu", "antonio.meirosu@gmail.com");
        Cliente c2 = new Cliente("8", "48976237b", "Anto", "Meiro", "antonio.meirosu444@gmail.com");
        
        clientes.add(c1);
        clientes.add(c2);

        PersistenciaCliente persistencia = new PersistenciaCliente();

        persistencia.write(clientes);
        clientes = persistencia.read();

        System.out.println("Fin del test");
    } 
}