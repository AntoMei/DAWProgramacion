package Ejercicios.Formas;

public class Test {
    public static void main(String[] args) {
        Forma f1 = new Forma("rojo", 2, 3, "forma1");
        f1.imprimir();
        f1.mover(7, 8);
        f1.imprimir();
        f1.setColor("amarillo");
        f1.imprimir();

        Rectangulo r1 = new Rectangulo("azul", 6, 0, "rec1", 4, 0);
        r1.imprimir();
        r1.mover(7, 8);
        r1.getArea();
        r1.imprimir();
    }
}