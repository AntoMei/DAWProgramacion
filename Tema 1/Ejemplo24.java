import java.util.Scanner;
public class Ejemplo24 {
    public static void main(String args[]){
    Scanner inputValue = new Scanner(System.in);
    int numero =0;
    double total = 0;
    int contador = 0;

    System.out.println("Lee el conjunto de notas");
        
        do {
            numero = inputValue.nextInt();
            total = total + numero;
            contador++;
        inputValue.close();
        
        
    }while (numero!=1);
        System.out.println("Media:"+total/contador);
}
}
