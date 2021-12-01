public class Comunes {
    public static void main(String[] args) {
        int [] numeros1 = {1, 5, 7, 99, 4, 3};
        int [] numeros2 = {6, 8, 99, 4, 2, 45};

        System.out.println("===============");
        System.out.println("==  Repetidos ==");
        System.out.println("===============");
        for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros2.length; j++) {
                if (numeros1[i] == numeros2[j]){
                    System.out.println("Elemento común:"  + numeros1[i]);
                }
            }
        }
    }
}