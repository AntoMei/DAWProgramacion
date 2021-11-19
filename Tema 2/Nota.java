import java.util.Scanner;

public class Nota {
    public static void nota(int nota){
        if ((nota>=0)&&(nota<3)){
            System.out.println("Muy Deficiente");
        }else if((nota>=3)&&(nota<5)){
            System.out.println("Insuficiente");
        }else if((nota>=5)&&(nota<6)){
            System.out.println("Suficiente");
        }else if((nota>=6)&&(nota<7)){
            System.out.println("Bien");
        }else if((nota>=7)&&(nota<9)){
            System.out.println("Notable");
        }else if((nota>=9)&&(nota<=10)){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Incorrecta");
        }
    }
    public static void main(String[] args) {
        int nota;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca la nota:");
        nota = lector.nextInt();
        lector.close();

        nota(nota);
    }
}