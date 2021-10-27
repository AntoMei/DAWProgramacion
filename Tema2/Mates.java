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
    public static double areaCirculo(double radio){
        double resultado = Math.PI * radio * radio;
        return resultado;
    
    }
}