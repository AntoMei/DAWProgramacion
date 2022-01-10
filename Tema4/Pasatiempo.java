public class Pasatiempo {

    public static String crearElpasatimepo (String frase) {
        String pasatiempo = "";
        for (int i = 0; i < frase.length(); i++) {
            if("aeiouAEIOU".contains(""+ frase.charAt(i))){
                pasatiempo = pasatiempo + ".";
            }else{
                pasatiempo = pasatiempo + frase.charAt(i);
            }
        }
        return pasatiempo;
    }
       
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce la cadena:");

        String frase = crearElpasatimepo(cadena);
        System.out.println(frase);
    }
}
