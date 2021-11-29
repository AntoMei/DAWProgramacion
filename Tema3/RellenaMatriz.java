public class RellenaMatriz {
   public static void main(String[] args) {
        int [][] matriz = new int[10][10];
           
        Utilidades.rellenaMatriz(matriz, 0, 1);

        Utilidades.mostrarMatriz(matriz);
        
        System.out.println("Fin");

    }
}