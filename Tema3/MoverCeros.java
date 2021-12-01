public class MoverCeros {
    public static void main(String[] args) {
        int [] numeros = {1,2,0,3,0,4};

        for (int i = 0; i < numeros.length - 1; i++){
            if(numeros[i] == 0){
                int j = i + 1;
                while(j < numeros.length){
                    if (numeros[j] == 0){
                        j++;
                    }else{
                        int aux = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = aux;
                        j++;
                        i++;
                    }
                }                     
            }
        }
    }
}