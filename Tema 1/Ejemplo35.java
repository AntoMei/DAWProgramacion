import java.util.Scanner;
public class Ejemplo35 {
    public static void main(String args[]){
    int numero[] = new int[10];
    double media = 0;
    int nota;
    Scanner lector = 

    System.out.println("Introduce las notas:");
    nota = lector.nextInt();

    for (int i= 0; i< numero.length; i++){
        media = media + numero[i];
    }
    media = media / numero.length;
}
}