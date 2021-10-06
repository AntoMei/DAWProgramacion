import java.util.Scanner;
public class Ejemplo6 {
    public static void main (String argv[]) {
        float area;
        final double PI = 3.14159;
        float radio;
        float length;
       
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Pide el radio de una circunferencia");
        radio = inputValue.nextInt();

        length = (float) (2*PI*radio);
        area = (float) (PI*radio*radio);

        System.out.println("lengh:"+length);
        System.out.println("area:"+area);
        inputValue.close();
    }
}