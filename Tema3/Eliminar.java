public class Eliminar {
    public static void main(String[] args) {
        //int[] elementos = new int [10];

        //Utilidades.rellenaArray(elementos, 1, 20);

        int [] elementos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int indice;

        indice = obtenerIndice(elementos);
        eliminarElemento(elementos, indice);
        Utilidades.mostrarArray(elementos);
    }

    private static int obtenerIndice(int[] elementos) {
        int indice;
        do{
            indice = Utilidades.leerEntero("Índice de elemento a eliminar");
        }while((indice < 0) || (indice > (elementos.length - 1)));
        return indice;
    }

    private static void eliminarElemento(int[] elementos, int indiceBorrar) {
        int elementoBorrar = elementos[indiceBorrar];

        for (int i = indiceBorrar +1; i < elementos.length; i++) {
            elementos[i-1] = elementos[i];
            
        }
        elementos[elementos.length-1] = elementoBorrar;
    }      
}