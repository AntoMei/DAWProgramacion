package Ejercicios.network;

import java.util.ArrayList;

public class Mensaje {
    
    private String usuario;
    private String texto;
    private String marcaTemporal;
    private int likes;
    private ArrayList<String> comentarios;

    public Mensaje(String usuario, String texto, String marcaTemporal) {
        this.usuario = usuario;
        this.texto = texto;
        this.marcaTemporal = marcaTemporal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
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