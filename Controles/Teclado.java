public class Teclado {

  //Atributos
  private String color;
  private int numeroTeclas;
  private String conectividad;
  private String idioma;
  private String formato;
  private static int contador = 0;

  //Constructores
  public Teclado(){
  this.color = "azul";
  this.numeroTeclas =254;
  this.conectividad ="cable";
  this.idioma = "ES";
  this.formato = "compacto";
  contador++;
  }

  public Teclado (String color, int numeroTeclas, String conectividad, String idioma, String formato){
    this.color = color;
    this.numeroTeclas = numeroTeclas;
    this.conectividad = comprobarConectividad(conectividad);
    this.idioma = comprobarIdioma(idioma);
    this.formato = comprobarFormato(formato);
  }

  //Getters y Setters
  public String getColor() {
    return  color;
  }

  public int getNumeroTeclas() {
    return numeroTeclas;
  }

  public String getConectividad() {
    return conectividad;
  }

  public String getIdioma() {
    return idioma;
  }

  public String getFormato() {
    return formato;
  }

  public static int getContador() {
    return contador;
  }

  //Método contador
  public static void contador(){
    contador++;
  }
  
  //Metodo para comprobar la conectividad
    private static String comprobarConectividad(String conectividad){
      if (conectividad == "inalambrico" || conectividad == "cable") {
        return conectividad;
      }else{
        return conectividad = "cable";
      }
    }

  //Método para comprobar el idioma
  private static String comprobarIdioma(String idioma) {
    if(idioma.length() ==2){
      return idioma = "ES";
    }else{
      return idioma;
    }
  }
  
  //Metodo para comprobar el formato
    private static String comprobarFormato (String formato){
      if(formato == "compacto" || formato == "extendido"){
        return formato;
      }else{
        return formato = "extendido";
      }
    }
  
  //Método tostring
  public String toString(){
    return color + " - " + numeroTeclas + " - " + formato;
  }
}