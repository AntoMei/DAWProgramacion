import java.util.Scanner;
public class Ejemplo28 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int contador,i,numero;

        System.out.println("Ingresa el número:");
        numero = inputValue.nextInt();
        inputValue.close();

        contador = 0;

        for (i=1;i<=numero;i++)
        {
            if ((numero%i)==0)
            {
                contador++;
            }
        }
        if(contador<=2)
        {
            System.out.println("El número es primo");
        }else{
            System.out.println("El número no es primo");
        }
    }
}