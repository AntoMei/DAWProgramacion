public class EsPositivos {
    public static int positivos(int[] numeros){
        int pos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>0){
                pos++;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
    }
}