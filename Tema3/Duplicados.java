public class Duplicados {
    public static void main(String[] args) {
        int[]numeros ={1,2,4,4,7,8,8,9,9,4,5,9};

        for(int i=0;i<numeros.length;i++){
            for(int j=i+1;j<numeros.length;j++){
                if(numeros[i]==numeros[j]){
                    System.out.println("Elemento repetido: " + numeros[i]);
                }
            }
        }
    }
}