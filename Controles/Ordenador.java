public class Ordenador {
  
  private String formato;
  private String color;
  private Teclado teclado;

  public Ordenador(){
    this.formato = "sobremesa";
    this.color ="azul";
    teclado = new Teclado();
  }

  public Ordenador(String formato, String color, Teclado teclado){
    this.formato = formato;
    this.color = color;
    this.teclado = teclado;
  }
  
  }
}
