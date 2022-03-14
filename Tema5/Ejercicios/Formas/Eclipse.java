package Ejercicios.Formas;

public class Eclipse extends Forma{

    private double radioMayor;
    private double radioMenor;

    public Eclipse(String color, int x, int y, String nombre, double radioMayor, double radioMenor) {
        super(color, x, y, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public double getRadio(){
        return Math.PI;
    } 
}
