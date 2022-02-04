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
    this.conectividad = Teclado.comprobarConectividad(conectividad);
    this.idioma = comprobarIdioma(idioma);
    this.formato = comprobarFormato(formato);
  }
  //Getters y Setters
  public String getColor() {
    return  color;
  }

  public void setColores(String color) {
    this.color = color;
  }

  public int getNumeroTeclas() {
    return numeroTeclas;
  }

  public void setNumeroTeclas(int numeroTeclas) {
    this.numeroTeclas = numeroTeclas;
  }

  public String getConectividad() {
    return conectividad;
  }

  public void setConectividades(String conectividad) {
    this.conectividad = conectividad;
  }

  public String getIdioma() {
    return idioma;
  }

  public void setIdioma(String idioma) {
    this.idioma = idioma;
  }

  public String getFormato() {
    return formato;
  }

  public void setFormato(String formato) {
    this.formato = formato;
  }

  public static int getContador() {
    return contador;
  }

  public static void setContador(int contador) {
    Teclado.contador = contador;
  }
  //Método para comprobar el idioma
  private static String comprobarIdioma(String idioma) {
    if(idioma.length() ==2){
      return idioma = "ES";
    }else{
      return idioma;
    }
  }

    private static String comprobarFormato (String formato){
      if(formato == "compacto" || formato == "extendido"){
        return formato;
      }else{
        return formato = "extendido";
      }
    }
    private static String comprobarConectividad(String conectividad){
      if (conectividad == "inalambrico" || conectividad == "cable") {
        return conectividad;
      }else{
        return conectividad = "cable";
      }
    }
  }