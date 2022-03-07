package Ejercicios.CutreCloud;

import java.util.Scanner;

public class UsuarioInput {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        System.out.println("------BIENVENIDO A CUTRECLOUD------");
        System.out.println("1. Para añadir nuevos Usuarios pulse 1 : ");
        System.out.println("2. Para salir pulse 0 : ");

        opcion = teclado.nextInt();

        if (opcion == 1) {
            String email = "";
            String password = "";

            Usuario nuevoUsuario = new Usuario(email, password);

            System.out.println("Introduzca el email del Usuario : ");
            email = teclado.next();
            System.out.println("Introduzca el password del Usuario : ");
            password = teclado.next();

            nuevoUsuario.generateXML();
            nuevoUsuario.writeXML();
            
        }else{
            if (opcion != 1) {
                System.out.println("Ha salido del programa.");
                
            }
        }
    }
}  