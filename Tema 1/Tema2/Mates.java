package Tema2;
public class Mates {
    public static double suma(double x, double y){
        return x + y;
    }
        
    public static double resta(double x, double y){
        return x - y;
    }

    public static double multiplicacion(double x, double y){
        return x * y;
    }

    public static double division(double x, double y){
        return x / y;
    }
    
    public static void main(String[] args) {
       System.out.println("Suma: 14 es igual a " +suma (7,7));
       System.out.println("Resta: 8 es igual a " +resta (16,8));
       System.out.println("Multiplicacion: 18 es igual a " +multiplicacion(2,9));
       System.out.println("Division: 20 es igual a " +division (40,2));
    }
}