import java.util.Scanner;
public class Ejemplo34 {
    public static void main(String[] args) {
        String numeroDNI, numeroDNIsinLetra;
        int valordeLetra = 0;
        char[] anArray = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Dame los numero del NIE para verificar su letra:");
        numeroDNI = lector.nextLine();

        if(numeroDNI.length() == 8){

            if(numeroDNI.charAt(0) == 'X'){
                valordeLetra = 0;
            } else if(numeroDNI.charAt(0) == 'Y'){
                valordeLetra = 1;
            } else if(numeroDNI.charAt(0) == 'Z'){
                valordeLetra = 2;
            } else {
                System.out.println("Error");
            }

            numeroDNIsinLetra = numeroDNI.substring(1, numeroDNI.length());
        
            int numEntero = Integer.parseInt(numeroDNIsinLetra);
            int numeroDNIconLetra = Integer.valueOf(String.valueOf(valordeLetra) + String.valueOf(numEntero));

            System.out.println(numeroDNI + "" + anArray[numeroDNIconLetra%23]);
        } else {
            System.out.println("Erorr! El numero de digitos no es correcto!");
        }
        lector.close();
    }    
}