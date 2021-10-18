import java.util.Scanner;
public class Ejemplo19 {
    public static void main(String args[]){
       //Declaración de variables
       int horas;
       float precio;
       float bruto;
       float impuestos;
       Scanner inputValue = new Scanner(System.in);
       
       //Empieza el programa
       System.out.println("Introduce las horas");
       horas = inputValue.nextInt();
       System.out.println("Introduce las horas");
       System.out.println("Introduce el precio por hora");
       precio = inputValue.nextFloat();

       //Horas
       if(horas<=35){
          bruto = horas * precio;
       }else{
        bruto = 35 * precio;
        bruto += ((horas -35) * precio * 1.5);
       }
       //Impuestos
       if(bruto<=500){
           impuestos=0;
       }else if (bruto<=900){
           impuestos=(bruto-500) * 0.25f;
       }else{
           impuestos = (400-0.25f) + (bruto-500-400) * 0.45f;
       }
       inputValue.close();

       System.out.println("Pago bruto"+bruto);
       System.out.println("Salario neto"+(bruto - impuestos));
       System.out.println("Impuestos"+impuestos);
    }
}