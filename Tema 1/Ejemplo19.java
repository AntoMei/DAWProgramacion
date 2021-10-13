import java.util.Scanner;
public class Ejemplo19 {
    public static void main(String args[]){
       //Declaración de variables
       int horas;
       double precioporhora;
       double pagobruto, salarioneto, impuestos;
       Scanner inputValue = new Scanner(System.in);
       
       //Empieza el programa
       System.out.println("Introduce el precio/hora");
       precioporhora = inputValue.nextDouble();
       System.out.println("Introduce el número de horas");
       horas = inputValue.nextInt();
       inputValue.close();
       
       if(horas>35){
           System.out.println()