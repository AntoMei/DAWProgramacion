package Repaso;

import java.io.IOException;

public class PersistenciaClienteTest {
    public static void main(String[] args) throws IOException {
        PersistenciaCliente pc = new PersistenciaCliente();
        
        Cliente cl = new Cliente(1, "53464", "vfgerb", "fvb", "fdabsb");
        Cliente c1 = new Cliente(2, "543266", "vdsavv", "vsdvaeber", "bfdabert");

        pc.clientes.add(cl);
        pc.clientes.add(c1);

        pc.write();
        pc.read();
        System.out.println(cl.toString());
    }
}