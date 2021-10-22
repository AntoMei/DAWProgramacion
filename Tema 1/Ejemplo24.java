import java.util.Scanner;
public class Ejemplo24 {
    public static void main(String args[]){
    Scanner lector = new Scanner(System.in);
    int numero =0;
    double total = 0;
    int contador = 0;
    boolean hayDiez = false;
    
    System.out.println("Introduce las notas, si desea finalizar escribe -1:");
        do {
            numero = lector.nextInt();

            if (numero!=1){
                total = total +numero;
                contador ++;
            }

            if (numero == 10){
                hayDiez = true;
            }

        }while (numero!=-1);
            if (contador > 0){
                System.out.println("Media:"+total/contador);
            }else{
                System.out.println("Media:"+0);
            }
            if(hayDiez){
                System.out.println("Hay diez");
            }else{
                System.out.println("No hay diez");
            }
            lector.close();
        }
        }