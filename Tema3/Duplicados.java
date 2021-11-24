public class Duplicados {
    public static void main(String[] args) {
        int[]numeros ={1,2,4,4,7,8,8,9};

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if(numeros[i] == numeros[j]){
                    if(j!=i){
                        System.out.println(numeros[i]+" "+numeros[j]);
                    }
                }
            }
        }
    }
}