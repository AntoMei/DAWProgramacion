public class Ejemplo35 {
    public static void main(String args[]){
    int numero[] = new int[10];
    double media = 0;
    System.out.println("Introduce las notas:");
    for (int i= 0; i< numero.length; i++){
        media = media + numero[i];
    }
    media = media / numero.length;
}
}