import java.util.Scanner;
public class Ejemplo37 {
    public static void main(String[] args) {
        double [] numeros = new double [10];

        double maximo;
        double minimo;

        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = lector.nextDouble();
            
        }
        
        maximo = numeros[0];
        minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i]>maximo){
                maximo = numeros[i];
            }

            if (numeros[i]< minimo){
                minimo = numeros[i];
            }
        }
        System.out.println("Maximo:"+maximo);
        System.out.println("Minimo:"+minimo);
    }
}