import java.awt.Point;

public class Silla {

    public Silla() {
        //Aquí generar silla aleatoria
    }
    public Silla(String color, int numeroPatas, boolean tieneRespaldo, int comodidad, String material, Point ubicacion) {
        this.color = color;
        this.numeroPatas = numeroPatas;
        this.tieneRespaldo = tieneRespaldo;
        this.comodidad = comodidad;
        this.material = material;
        this.ubicacion = ubicacion;
    }

    //Atributos de objetos
    private String color;
    private int numeroPatas; //0-100
    private boolean tieneRespaldo;
    private int comodidad; //0-10
    private String material;
    private Point ubicacion;

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