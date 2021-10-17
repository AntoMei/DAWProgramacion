public class Ejemplo30 {
    public static void main(String[] args) {
        String palabra =
        int inicio = 0;
        int termina = palabra.length()-1;
        boolean bError = false;

        while ((inicio<termina)&& (bError)){
            if(palabra.charAt(inicio)==palabra.charAt(termina)){
                inicio++;
                termina--;
            }else{
                bError = true;
            }
        }
        if (!bError){
            System.out.println(palabra+"es un palindromo");
        }else{
            System.out.println(palabra+"No es un palindromo");
        }
    }
}