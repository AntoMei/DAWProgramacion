package Ejercicios.network;

import java.util.ArrayList;

public class Fotografia {
    private String usuario;
    private String archivo;
    private String titulo;
    private String marcaTemporal;
    private String rutaImagen;
    private int likes;
    private ArrayList<String> comentarios;

    public Fotografia(String usuario, String archivo, String titulo, String marcaTemporal) {
        this.usuario = usuario;
        this.archivo = archivo;
        this.titulo = titulo;
        this.marcaTemporal = marcaTemporal;
    }

    public String getRutaImagen() {
      return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
      this.rutaImagen = rutaImagen;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getArchivo() {
        return archivo;
    }
    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getMarcaTemporal() {
        return marcaTemporal;
    }
    public void setMarcaTemporal(String marcaTemporal) {
        this.marcaTemporal = marcaTemporal;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public ArrayList<String> getComentarios() {
        return comentarios;
    }
    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public void addComment(String commentText){
      this.comentarios.add(commentText);
    }

    public void deleteComment(int commentID){
      ArrayList<String> temp = new ArrayList<String>();

      for (int i = 0; i < this.comentarios.size(); i++) {
        if ( i!=commentID) {
          temp.add(this.comentarios.get(i));
        }
        this.comentarios = temp;
          
        }
      }

    public void incrementarLikes(){
      this.likes= this.likes+1;
    }
    public void decrementarLikes(){
      this.likes= this.likes-1;
    }
}