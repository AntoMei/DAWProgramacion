package Agenda;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Agenda a1 = new Agenda();
        a1.pedirUsuarios();
        a1.imprimirListadoTexto();
    }
    
}
