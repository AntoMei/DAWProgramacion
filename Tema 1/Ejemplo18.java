import java.util.Scanner;
public class Ejemplo18 {
    public static void main(String args[]){
       //Declaración de variables
       int horas, minutos, segundos;
       Scanner inputValue = new Scanner(System.in);
       
       //Empieza el programa
       System.out.println("Introduce la hora");
       horas = inputValue.nextInt();
       System.out.println("Introduce los minutos");
       minutos = inputValue.nextInt();
       System.out.println("Introduce los segundos");
       segundos = inputValue.nextInt();
       inputValue.close();

       if (horas<24 && minutos<60 && segundos<60);
            if (segundos<61 && segundos>=0);
                System.out.println(horas+"horas"+minutos+"minutos"+(segundos+1)+"segundos");
    }
}