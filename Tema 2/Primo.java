public class Primo {
    public static boolean esPrimo(int numero){
        int contador = 0;

        for (int i=1;i<=numero;i++)
        {
            if ((numero%i)==0)
            {
                contador++;
            }
        }
        if(contador<=2)
        return true;
        return false;
    }
     public static void main(String[] args) {
         System.out.println(esPrimo(199));
         System.out.println(esPrimo(200));
     }
    }
