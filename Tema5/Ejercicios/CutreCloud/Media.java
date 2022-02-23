package Ejercicios.CutreCloud;

import java.util.ArrayList;

public class Media {

    private int id;
    private String nombre;
    private String contenido;
    private ArrayList<String> tipo = new ArrayList<>(); 

    public Media(int id, String nombre, String contenido, ArrayList<String> tipo) {
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ArrayList<String> getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }   
}