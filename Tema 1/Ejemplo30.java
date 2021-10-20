import java.util.Scanner;
public class Ejemplo30 {
    public static void main(String[] args) {
       String sPalabra = "dabale arroz a la zorra el abad";
       Scanner inputValue = new Scanner (System.in);
       int inc =  0;
       int des = sPalabra.length()-1;
       boolean bError = false;

       System.out.println("Introduzca una palabra o una frase:");
       sPalabra = new inputValue.nextLine());

       while ((inc<des)&&(!bError)){
           if (sPalabra.charAt(inc)==sPalabra.charAt(des)){
               inc ++;
               des --;
           }else{
               bError = true;
           }
        }
        if (!bError)
            System.out.println(sPalabra + "es un palindromo");
            
        else

            System.out.println(sPalabra + "no es un palindromo");
    }
}