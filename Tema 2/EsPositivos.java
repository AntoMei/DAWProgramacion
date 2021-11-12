public class EsPositivos {
    public static int positivos(int[] numeros){
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>=0){
                resultado++;
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        int [] numeritos = {4,6,-1,-2,5,9};
        System.out.println(positivos(numeritos));
    }
}