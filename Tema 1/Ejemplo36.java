public class Ejemplo36 {
    public static void main(String[] args) {
        int numeros[] = new int [10];
        int maximo = numeros[0];
        for (int i = 0; i < 10; i++){
            if (maximo < numeros[i]){
                maximo = numeros[i];
            }
        System.out.println("El maximo de los números es:"+maximo);
        }
    }
}