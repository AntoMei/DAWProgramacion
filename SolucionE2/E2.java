public class E2 {

    public static void main(String[] args) {
        int [] array1 = {7,8,5,5,10};
        int [] array2 = {5,9,2,3,5};

        int [] resultado;

        resultado = obtenerRestos(array1, array2);


        imprimirArray(array1);
        imprimirArray(array2);
        imprimirArray(resultado);
    }

    public static int[] obtenerRestos(int[] array1, int[] array2){

        int[] resultado = new int[array1.length];

        if (array1.length == array2.length) {
            for (int i = 0; i < array2.length; i++) {
                resultado[i] = array1[i]%array2[i];
            }
            return resultado;  
        }else{
            return null;
        }
    }

    public static void imprimirArray(int[] array){
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");   
        }
    }  
}