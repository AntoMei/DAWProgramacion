public class Ejemplo36 {
    public static void main(String[] args) {
        int numeros[] = {1,2,3,4,5,6,7,8,9,10};
        int maximo = numeros[0];
        for (int i = 0; i < 10; i++){
            if (maximo < numeros[i]){
                maximo = numeros[i];
            }
        System.out.println("El maximo de los números es:"+maximo);
        }
    }
}