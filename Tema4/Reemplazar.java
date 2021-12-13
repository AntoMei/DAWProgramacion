public class Reemplazar {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduzca su cadena");
        char a;
        char b;

        System.out.println("La cadena original es:" + cadena);
        System.out.println("Reemplazar la a por la b" + cadena.replace('a', 'b'));
    }
}