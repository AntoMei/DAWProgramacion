public class EsPotencia {
    public static double potencia(double x, int y){
        if (y == 0) return 1;
        if (y == 1) return x;
        if (y == 2) return x * x;
        if (y %2 == 0) return potencia(potencia(x, y/2), 2);
        return x * (potencia(x, y-1));
    }

    public static void main(String[] args) {
        double prueba1 = potencia(4, 2);
        double prueba2 = potencia (8, 2);
        double prueba3 = potencia (16, 2);
        double prueba4 = potencia (32, 2);
    }
}