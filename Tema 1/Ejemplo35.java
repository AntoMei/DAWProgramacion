import java.util.Scanner;
public class Ejemplo35 {
    public static void main(String args[]){
    Scanner lector = new Scanner(System.in);
    int [] notas = new int [10];
    double total = 0;
    boolean hayDiez = false;
    
        for (int j = 0; j < notas.length; j++) {
            notas[j] = lector.nextInt();
        
            total = total + notas[j];

            if (notas[j] == 10){
                hayDiez = true;
            }
         
        }
        System.out.println("Media:" + total/10);

        if (hayDiez){
            System.out.println("Hay diez");
        }else{
            System.out.println("No hay diez");
        }
        lector.close();
    }
}