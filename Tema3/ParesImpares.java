public class ParesImpares {
    public static void main(String[] args) {
        int [] vector = {1,2,3,4,5,6,7,8,9,10};


        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0){
                System.out.println(+vector[i]+ " Es par");
            }else{
                System.out.println(+vector[i]+ " Es impar");
            }
        }
    }
}