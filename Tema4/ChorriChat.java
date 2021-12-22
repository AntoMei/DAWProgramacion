import java.util.Scanner;

public class ChorriChat {

    final static int SIN_SALUDO = 0;
    final static int SALUDO = 1;
    final static int BUCLE = 2;
    final static int FIN = 3;
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        int estado = SIN_SALUDO;

        while (estado != FIN){
            System.out.print("ChorriCHat");
            String linea = lector.nextLine().toLowerCase();
            estado = updateEstado(estado, linea);
            imprimirFrase(estado);

        }
        lector.close();
    }
        
        public static void imprimirFrase(int estado){
            switch(estado){
                case:
            }
        }

        public static void updateEstado(int estado, String cadena){

        }
        



        public static boolean esSaludo(String linea){
            String minusculas = linea.toLowerCase();
            if(minusculas.equals("hola")){
            return true;
            }else if (minusculas.equals("buenos dias")){
                return true;
            }else if (minusculas.equals("buenas")){
                return true;
            }else{
                return false;
            }
        }
    }
    public static boolean isSaludo(String linea){
        return (linea.contains("hola") ||
                linea.contains("buenos dias") ||
                linea.contains("buenas"));
    }

    public static boolean isFin(String cadena){

    }
    }
