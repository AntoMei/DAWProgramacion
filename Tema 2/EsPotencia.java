public class EsPotencia {
    public static double potencia(double x, int n){
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == 2) return x * x;
        return x * (potencia(x, n-1));  
    }

    public static void main(String[] args) {
        double prueba1 = potencia(4, 2);
        double prueba2 = potencia (8, 2);
        double prueba3 = potencia (16, 2);
        double prueba4 = potencia (32, 2);
    }
}