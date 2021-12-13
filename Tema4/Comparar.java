public class Comparar {
    public static void main(String[] args) {
        String cadena1 = "aaaaaaaaaaaa";
        String cadena2 = "aaaaaaaa";

        if(cadena1.compareTo(cadena2) == 0){
            System.out.println("Las cadenas son iguales");
        }else{
        if (cadena1.compareTo(cadena2)<0){
            System.out.println("La primera cadena es menor");
        }else{
            System.out.println("La primera cadena es mayor");
        }
    }
}
}