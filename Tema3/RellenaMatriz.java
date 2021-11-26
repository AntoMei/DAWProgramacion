import java.util.Arrays;

public class RellenaMatriz {
   public static void main(String[] args) {
       
    int[][] matriz = new int [10] [10];
    int min = 0;
    int max = 1;
    Utilidades.rellenaMatriz(matriz, min, max);
    
    System.out.println("matriz: " + Arrays.deepToString(matriz));

    }
}