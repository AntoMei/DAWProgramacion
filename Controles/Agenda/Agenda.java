package Agenda;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private static ArrayList<Usuario>usuarios = new ArrayList<>(); 

    public void pedirUsuarios(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Añada el nombre: ");
        String nombre  = entrada.nextLine();

        System.out.println("Añada el apellido: ");
        String apellidos  = entrada.nextLine();

        System.out.println("Añada el email: ");
        String email  = entrada.nextLine();

        System.out.println("Añada el telefono: ");
        int telefono = entrada.nextInt();

            /*File archivo = new File("Controles/Agenda/agenda.dat");
            FileWriter escribir = new FileWriter(archivo);
            escribir.write(cadena1 + "\t");
            escribir.write(cadena2 + "\t");
            escribir.write(cadena3 + "\t");
            escribir.write(num + "\t");
            escribir.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        Usuario u1 = new Usuario(nombre, apellidos, email, telefono);
        usuarios.add(u1);
        
        try {
            BufferedWriter archivo = new BufferedWriter(new FileWriter("Controles/Agenda/agenda.dat"));
            
            for (Usuario item : usuarios) {
                String usuario = item.getNombre() + "\t" + item.getApellidos() + "\t" + item.getEmail() + "\t" + item.getTelefono() + "\n";
                archivo.write(usuario);              
            }
            archivo.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   

    public void imprimirListadoTexto() throws FileNotFoundException, IOException{

        ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("Controles/Agenda/agendaObjetos.dat"));

        for (int i = 0; i < 4; i++) {
            Usuario u1 = new Usuario("Antonio", "Meirosu", "antonio@gmail.com", 123456789);
            Usuario u2 = new Usuario("Anto", "Mei", "anto@gmail.com", 987654321);
            archivo.writeObject(u1);
            archivo.writeObject(u2);
        }
        archivo.close();
    }
    
    public void imprimirlistadoObjetos(){

    }
}
