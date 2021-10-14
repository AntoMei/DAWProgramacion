import java.util.Scanner;
public class Ejemplo19 {
    public static void main(String args[]){
       //Declaración de variables
       int horas;
       double impuestos;
       Scanner inputValue = new Scanner(System.in);
       
       //Empieza el programa
       System.out.println("Introduce el número de horas");
       horas = inputValue.nextInt();
       inputValue.close();
       
       //Más de 35 horas
       if(horas>35){
           System.out.println(35*1.5);
    