import java.util.Random;

public class RellenaMatriz {
   public static void main(String[] args) {
    Random ale = new Random();

    int [] []matriz=new int [10][10];

    for (int i = 0; i< matriz.length; i++) 
        {
            for (int j = 0; j < matriz.length; j++)       
        {
            matriz[i][j]=ale.nextInt(0-1);
        }
    }
    System.out.println("Matriz");

    String imprimir="";

    for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
        { 
            imprimir=imprimir+"| "+matriz[i][j];     
        }
        imprimir=imprimir+" |\n";
        System.out.println(imprimir);


    }
}
}