public class EsDivisible {
    public static int esDivisible(int n, int m){
        int resto;
        resto = n%m;
        return  resto;
    }

    public static void main(String[] args) {

        if (esDivisible(4, 3) == 0){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
    }
}