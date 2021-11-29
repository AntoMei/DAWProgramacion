import java.util.Arrays;

public class Iguales {
        public static String iguales(int[] original, int[] comparar) {
            String iguales = "";
            // Recorremos el original para buscar el elemento iésimo
            for (int i = 0; i < original.length; i++) {
                // Y ahora buscamos en el comparar el elemento iésimo
                for (int j = 0; j < comparar.length; j++) {
                    if (original[i] == comparar[j]) {
                        iguales += original[i] + " ";
                        break;
                    }
                }
            }
            return iguales;
        }
    
    public static void main(String[] args) {
        int[] array1 = new int[10];
        array1.clone();
    
        
        Utilidades.rellenaArray(array1, -10, 10);
    
        // Antes de empezar a trabajar con el array lo imprimimos
        System.out.println("Array : " + Arrays.toString(array1));
    
        System.out.println("Los elementos comunes son: " + iguales(array1, array1.clone()));
    }
}