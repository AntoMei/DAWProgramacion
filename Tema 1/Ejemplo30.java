import java.util.Scanner;
public class Ejemplo30 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        String palabra = inputValue.nextLine();

        int contador = 1;
        for (int i = 0; i < palabra.length(); i++){

            if (palabra.charAt(i) != palabra.charAt(palabra.length()-1-1)){
                contador = 0; break;
            }
            inputValue.close();
            System.out.println(contador ==1 ?"es palindromo":"no es palindromo");
        }
    }
}