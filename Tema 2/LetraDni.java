public class LetraDni {
    public static int letraDni(int dni) {
        char resultado = ' ';

        char [] letras = {'T', 'R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        int indice = dni%23;
        resultado = letras[indice];

        return resultado;
    }
    public static void main(String[] args) {
        //Llamar a letraDNI con un entero directamente
         System.out.println(letraDni(12345678));
    }
}