import java.util.Scanner;
public class Ejemplo13 {
    public static void main (String argv[]) {
        //Decalración de variables
        double x,y;  
        byte opcion;
        Scanner inputValue = new Scanner(System.in);

        //Empieza el programa
        
System.out.println("Introduce el valor 1");
        x = inputValue.nextDouble();

        System.out.println("Introduce el valor 2");
        y = inputValue.nextDouble();
        
        System.out.println("Ascendente (1) o Descendente (2)");
        opcion = inputValue.nextByte();
        
        inputValue.close();
        
        if(opcion ==1) {
            if(x<=y){
            System.out.println(x+" "+y);
        }
        else{
            System.out.println(y+" "+x);
           }
        }else 
            if (opcion == 2){
                if(x<=y){
                    System.out.println(x+" "+y);
                 }
                 else{
                     System.out.println(y+" "+x);
        }
    }
    }
}