import java.util.Arrays;

public class Eliminar {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8};
        int[] numeros2 = null;
        int eliminar = 2;

        for (int i = 0; i < numeros.length-1; i++) {
            if (numeros[i] == eliminar){
                numeros2 = new int[numeros.length - 1];
                for (int index = 0; index < i; index++) {
                    numeros2[index] = numeros[index];
                }
                for (int j = i; j < numeros.length - 1; j++) {
                    numeros2[j] = numeros[j+i];
                }
                break;
            }
        }
        System.out.println("Se elimina el núemero "+eliminar+Arrays.toString(numeros2));
    }
}