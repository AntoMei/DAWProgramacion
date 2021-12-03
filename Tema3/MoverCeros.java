public class MoverCeros {
    public static void main(String[] args) {
        int [] vector = {1,2,3,0,0,4,0,6,6};

        for (int i = vector.length - 1; i >= 0; i--) {
            if(vector[i]== 0){}
                MoverCeroDerecha(vector, i);
        }
    }
     
     
    private static void MoverCeroDerecha(int[] vector, int pos) {
    
    for (int i = pos; i < vector.length; i++){
        vector[i] = vector[i+1];
        vector[i+1] = 0;

    }
}
}