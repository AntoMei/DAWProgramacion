package Ejercicios.CutreCloud;

import java.util.Scanner;

public class UsuarioInput {

    private static int opcion = 0;
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        mensajeBienvenida();

        if (opcion==1) {
            crearUsuario();  
            mensajeBienvenida();  
        }
        
        while (opcion==1) {
        crearUsuario();
        mensajeBienvenida();
        }
        teclado.close();
    }

    public static void mensajeBienvenida(){
    System.out.println("------BIENVENIDO A CUTRECLOUD------");
        System.out.println("1. Para añadir nuevos Usuarios pulse 1 : ");
        System.out.println("2. Para salir pulse 0 : ");
    
        opcion = teclado.nextInt();
    }

    public static void crearUsuario(){
        if (opcion == 1) {
           
            System.out.println("Introduzca el email del Usuario : ");
            String email = teclado.next();
            System.out.println("Introduzca el password del Usuario : ");
            String password = teclado.next();

            Usuario prueba = new Usuario(email, password);

            prueba.generateXML();
            prueba.writeXML();
            
        }else{
            if (opcion != 1) {
                System.out.println("Ha salido del programa.");
                
            }
        }
    }
}