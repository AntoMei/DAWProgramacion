import javax.xml.namespace.QName;

public class EsTriangulo {
    public static int esTriangulo(int lado1, int lado2, int lado3){
        int resultado;
        return resultado;

    }

    public static void main(String[] args) {
        esTriangulo(12,1,1);
        boolean resultado = false;

        if (lado1>(lado2 + lado3)){
            resultado = false;
        }else{
            if (lado1<(lado2+lado3)){
                resultado = true;
                System.out.println(resultado);
            }
        }
    }
}      