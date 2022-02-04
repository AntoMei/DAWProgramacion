public class Ordenador {
  
  private String formato;
  private String color;
  private Teclado teclado;

  //Contructores
  public Ordenador(){
    this.formato = "sobremesa";
    this.color ="azul";
    teclado = new Teclado();
  }

  public Ordenador(String formato, String color, Teclado teclado){
    this.formato = Ordenador.comprobarFormatoOrdenador(formato);
    this.color = color;
    this.teclado = teclado;
  }
  
  //Getters y Setters
  public String getFormato() {
    return formato;
  }

  public void setFormato(String formato) {
    this.formato = formato;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Teclado getTeclado() {
    return teclado;
  }

  public void setTeclado(Teclado teclado) {
    this.teclado = teclado;
  }

  //Método comprobar formato del Ordenador
  private static String comprobarFormatoOrdenador(String formato){
    if (formato == "sobremesa" || formato == "portátil"){
    return formato;
    }else{
      return formato = "sobremesa";
    }
  }
}