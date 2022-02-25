package Ejercicios.CutreCloud;

import java.util.ArrayList;

public class Media {

    private int id;
    private String nombre;
    private String contenido;
    private MediaType tipo;
    private Usuario usuario_id;

    public static ArrayList<Media> list = new ArrayList<>();

    public Media(int id, String nombre, String contenido, MediaType tipo, Usuario usuario_id) {
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario_id = usuario_id;
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

    public MediaType getTipo() {
        return tipo;
    }

    public void setTipo(MediaType tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Usuario usuario_id) {
        this.usuario_id = usuario_id;
    }

    //Método eliminar un media por nombre fichero.
    public void eliminarUnMedia(String nombre){

        for (Media item : list) {
          if (item.getNombre().equals(nombre)) {
              list.remove(item);
              break;  
          }
        }
    }

    //Método eliminar todos media de un tipo concreto.

    public void eliminarTodosMedias(MediaType tipo){
        for (Media item : list) {
            if (item.getTipo().equals(tipo)) {
                list.remove(item);
                break;
            }
        }
    }
}   