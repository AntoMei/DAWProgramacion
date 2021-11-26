public class Eliminar {
    public static void main(String[] args) {
        //int[] elementos = new int [10];

        //Utilidades.rellenaArray(elementos, 1, 20);

        int [] elementos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int indiceBorrar = 2;
        int elementoBorrar = elementos[indiceBorrar];

        for (int i = indiceBorrar +1; i < elementos.length; i++) {
            elementos[i-1] = elementos[i];
            
        }

        elementos[elementos.length-1] = elementoBorrar;

    }
       
}