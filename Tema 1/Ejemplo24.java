import java.util.Scanner;
public class Ejemplo24 {
    public static void main(String args[]){
    Scanner lector = new Scanner(System.in);
    int numero =0;
    double total = 0;
    int contador = 0;
    
    System.out.println("Introduce las notas, si desea finalizar escribe -1:");
        do {
            numero = lector.nextInt();
            total = total + numero;
            contador++;

        }while (numero!=-1);

        System.out.println("Media:"+total/contador);
        lector.close();
    }
}