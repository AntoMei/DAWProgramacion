import java.util.Scanner;
public class Ejemplo33 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numeroDNI;
        int resto = 0;
        String miLetra="";
        String[]letra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
       return miLetra[numeroDNI _% 23];

        System.out.println("Introduce tu número de DNI:");
        numeroDNI = inputValue.nextInt();
        inputValue.close();
       
        do{
            System.out.println("Introduce tu número de DNI:");
            numeroDNI = inputValue.nextInt();
        }while (numeroDNI<=0);
        System.out.println(+numeroDNI+"-"+miLetra);
    }
}     