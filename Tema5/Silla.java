import java.awt.Point;

public class Silla {

    private static final int COORDENADA_MIN = 0;
    private static final int COORDENADA_MAX = 100;
    private static final int PATAS_MIN = 0;
    private static final int PATAS_MAX = 4;
    private static final int COMODIDAD_MIN = 0;
    private static final int COMODIDAD_MAX = 10;

    private static final String  [] colores = {"azul", "rojo", "amarillo", "negro", "blanco"};
    private static final String  [] materiales = {"madera", "metal", "plástico"};

    //Atributos de objetos
    private String color; //Azul, Rojo, Amarillo, Negro, Blanco
    private int numeroPatas; //1-4
    private boolean tieneRespaldo;
    private int comodidad; //0-10
    private String material; //Madera, Metal, PLástico
    private Point ubicacion;

    public Silla() {
        
    //Aquí generar silla aleatoria
        this.color = Silla.colorAleatorio();
        this.material = Silla.materialAleatorio();
        this.numeroPatas  = Silla.numeroPatasAleatorio();
        this.tieneRespaldo = Silla.tieneRespaldoAleatorio();
        this.comodidad = Silla.comodidadAleatorio();
        this.ubicacion = Silla.ubicacionAleatorio();
    }
    public Silla(String color, int numeroPatas, boolean tieneRespaldo, int comodidad, String material, Point ubicacion) {
        this.color = color;
        this.numeroPatas = numeroPatas;
        this.tieneRespaldo = tieneRespaldo;
        this.comodidad = comodidad;
        this.material = material;
        this.ubicacion = ubicacion;
    }

    //Métodos para rellenar el Color,Materia, NumeroPatas, TieneRespaldo, Comodidad y Ubicacion aleatoriamente
    public static String colorAleatorio() {
        int min = 0;
        int max = colores.length - 1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return colores[aleatorio];
    }
    public static String materialAleatorio() {
        int min = 0;
        int max = materiales.length - 1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return materiales[aleatorio];
    }
    public static int numeroPatasAleatorio() {
        int min = Silla.PATAS_MIN;
        int max = Silla.PATAS_MAX;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return aleatorio;
    }
    public static boolean tieneRespaldoAleatorio() {
        int min = Silla.COMODIDAD_MIN;
        int max = Silla.COMODIDAD_MAX;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        if (aleatorio == 0) {
            return false;
        }else{
            return true;
        }   
    }
    public static int comodidadAleatorio() {
        int min = 0;
        int max = 10;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return aleatorio;
    }
    public static Point ubicacionAleatorio() {
        Point punto = new Point();
        int min = Silla.COORDENADA_MIN;
        int max = Silla.COORDENADA_MAX;

        int x = (int) (Math.random() * (max - min + 1) + min);
        int y = (int) (Math.random() * (max - min + 1) + min);

        punto.setLocation(x, y);

        return punto;
    }

    //Métodos de la clase
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNumeroPatas() {
        return numeroPatas;
    }
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    public boolean isTieneRespaldo() {
        return tieneRespaldo;
    }
    public void setTieneRespaldo(boolean tieneRespaldo) {
        this.tieneRespaldo = tieneRespaldo;
    }
    public int getComodidad() {
        return comodidad;
    }
    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public Point getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(Point ubicacion) {
        this.ubicacion = ubicacion;
    }
}