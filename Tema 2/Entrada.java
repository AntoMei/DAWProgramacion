import java.util.Scanner;
public class Entrada {
    public static int getInteger(){
        int resultado = 0;
        String mensaje = "Escriba un entero:";
        Scanner lector =  new Scanner(System.in);
        boolean enteroLeido = false;
        
        System.out.println(mensaje);
        while (!enteroLeido){
            if (lector.hasNextLine() && lector.hasNextInt()){
                resultado = lector.nextInt();
                
                enteroLeido = true;
            }else{
                System.out.println(mensaje);
            }
            lector.nextLine();
        }

        //lector.close();

        return resultado;
    }
}