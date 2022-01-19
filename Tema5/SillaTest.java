import java.awt.Point;

public class SillaTest {
    public static void main(String[] args) {
        Silla s1 = new Silla();
        s1.setColor("rojo");
        s1.setComodidad(2);
        s1.setNumeroPatas(4);
        s1.setTieneRespaldo(true);
        s1.setUbicacion(new Point(0,1));
    }
}